/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nnt.pojos;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pro_man")
public class ProMan implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    @ManyToOne
    private Product productId;
    @JoinColumn(name = "manufacturer_id", referencedColumnName = "id")
    @ManyToOne
    private Manufacturer manufacturerId;

    public ProMan() {
    }

    public ProMan(int id, Product productId, Manufacturer manufacturerId) {
        this.id = id;
        this.productId = productId;
        this.manufacturerId = manufacturerId;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the productId
     */
    public Product getProductId() {
        return productId;
    }

    /**
     * @param productId the productId to set
     */
    public void setProductId(Product productId) {
        this.productId = productId;
    }

    /**
     * @return the manufacturerId
     */
    public Manufacturer getManufacturerId() {
        return manufacturerId;
    }

    /**
     * @param manufacturerId the manufacturerId to set
     */
    public void setManufacturerId(Manufacturer manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

}
