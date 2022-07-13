/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nnt.pojos;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "manufacturer")
public class Manufacturer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name", length = 45)
    private String name;
    @Column(name = "country", length = 45)
    private String country;
    @OneToMany(mappedBy = "manufacturerId")
    private Set<ProMan> proManSet;

    public Manufacturer() {
    }

    public Manufacturer(int id, String name, String country, Set<ProMan> proManSet) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.proManSet = proManSet;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return the proManSet
     */
    public Set<ProMan> getProManSet() {
        return proManSet;
    }

    /**
     * @param proManSet the proManSet to set
     */
    public void setProManSet(Set<ProMan> proManSet) {
        this.proManSet = proManSet;
    }
}
