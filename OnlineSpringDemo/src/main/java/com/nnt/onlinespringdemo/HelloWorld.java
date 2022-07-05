/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nnt.onlinespringdemo;

import java.util.List;

public class HelloWorld {
    private String name;
    private Language lang;
    private List names;

    public HelloWorld() {
    }

    public HelloWorld(String name, Language lang) {
        this.name = name;
        this.lang = lang;
    }
    
    public void helloMess(){
        System.out.printf("Hello %s - Language %s\n", this.name, this.getLang().getLang());
        System.out.println(this.names);
    }
    
    public void helloMess2(){
        System.out.printf("Hello %s\n", this.name);
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
     * @return the lang
     */
    public Language getLang() {
        return lang;
    }

    /**
     * @param lang the lang to set
     */
    public void setLang(Language lang) {
        this.lang = lang;
    }

    /**
     * @return the names
     */
    public List getNames() {
        return names;
    }

    /**
     * @param names the names to set
     */
    public void setNames(List names) {
        this.names = names;
    }
}
