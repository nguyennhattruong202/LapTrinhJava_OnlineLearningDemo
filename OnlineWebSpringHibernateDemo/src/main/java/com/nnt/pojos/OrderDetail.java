/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nnt.pojos;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "order_detail")
public class OrderDetail implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @JoinColumn(name = "order_id", referencedColumnName = "id")
    @ManyToOne
    private SaleOrder saleOrderId;
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    @ManyToOne
    private Product productId;
    @Column(name = "unit_price")
    private BigDecimal unitPrice;
    @Column(name = "num", length = 45)
    private String num;

    public OrderDetail() {
    }

    public OrderDetail(int id, SaleOrder saleOrderId, Product productId, BigDecimal unitPrice, String num) {
        this.id = id;
        this.saleOrderId = saleOrderId;
        this.productId = productId;
        this.unitPrice = unitPrice;
        this.num = num;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the saleOrderId
     */
    public SaleOrder getSaleOrderId() {
        return saleOrderId;
    }

    /**
     * @param saleOrderId the saleOrderId to set
     */
    public void setSaleOrderId(SaleOrder saleOrderId) {
        this.saleOrderId = saleOrderId;
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
     * @return the unitPrice
     */
    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    /**
     * @param unitPrice the unitPrice to set
     */
    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * @return the num
     */
    public String getNum() {
        return num;
    }

    /**
     * @param num the num to set
     */
    public void setNum(String num) {
        this.num = num;
    }

}
