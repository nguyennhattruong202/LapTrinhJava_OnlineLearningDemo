/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.nnt.onlinespringdemo;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class OnlineSpringDemo {

    public static void main(String[] args) {
        
        
        
        
        
        
//        //Begin demo with no new JdbcTemplate
//        ApplicationContext context8 = new ClassPathXmlApplicationContext("Beans.xml");
//        JdbcTemplate template8 = (JdbcTemplate) context8.getBean("jdbcTemplate");
//        List<String> result8 = template8.query("SELECT * FROM category WHERE name LIKE concat('%', ?, '%')", (rs, i) -> {
//            return rs.getString("name");
//        }, "tính");
//        result8.forEach(v -> System.out.println(v));
//        //End demo with no new JdbcTemplate
        
        
        
        
        
//        //Begin demo CollectionDemo with Beans.xml
//        ApplicationContext context7 = new ClassPathXmlApplicationContext("Beans.xml");
//        CollectionDemo collectionDemo7 = (CollectionDemo) context7.getBean("collectionDemo");
//        System.out.println("List: " + collectionDemo7.getListDemo());
//        System.out.println("Set: " + collectionDemo7.getSetDemo());
//        System.out.println("Map:" + collectionDemo7.getMapDemo());
//        System.out.println("Properties: " + collectionDemo7.getPropertiesDemo());
//        //End demo CollectionDemo with Beans.xml
        
        
        
        
        
        
//        //Begin demo connect to MySQL with Beans.xml
//        ApplicationContext context5 = new ClassPathXmlApplicationContext("Beans.xml");
//        DataSource dataSource = (DataSource)context5.getBean("dataSource");
//        JdbcTemplate t = new JdbcTemplate(dataSource);
//        t.update("Update category SET description=? WHERE id=?", "May vi tinh", 5);
//        //End demo connect to MySQL with Beans.xml



        
        
//        //Begin demo select data into MySQL with Beans.xml
//        ApplicationContext context6 = new ClassPathXmlApplicationContext("Beans.xml");
//        DataSource dataSource6 = (DataSource) context6.getBean("dataSource");
//        JdbcTemplate template6 = new JdbcTemplate(dataSource6);
//        List<String> kq6 = template6.query("SELECT * FROM category WHERE name LIKE concat('%', ?, '%')", (rs, i)->{
//            return rs.getString("name");
//        }, "tính");
//        kq6.forEach(v -> System.out.println(v));
//        //End demo select data into MySQL with Beans.xml
        




//        //Begin demo list tag in Beans.xml
//        ApplicationContext context4 = new ClassPathXmlApplicationContext("Beans.xml");
//        HelloWorld h5 = (HelloWorld) context4.getBean("hello");
//        HelloWorld h6 = (HelloWorld) context4.getBean("hello2");
//        h5.helloMess();
//        h6.helloMess();
//        //End demo list tag in Beans.xml
        
        
        
        
        
        //Begin demo with constructor-arg in Beans.xml
//        ApplicationContext context3 = new ClassPathXmlApplicationContext("Beans.xml");
//        HelloWorld h4 = (HelloWorld) context3.getBean("hello2");
//        h4.helloMess();
//        //End demo with constructor-arg in Beans.xml
        
        
        
        
        
//        //Begin demo with ref in Beans.xlm
//        ApplicationContext context2 = new ClassPathXmlApplicationContext("Beans.xml");
//        HelloWorld h3 = (HelloWorld) context2.getBean("hello");
//        h3.setName("Truong2");
//        h3.helloMess();
//        //Begin demo with ref in Beans.xlm
        
        
        
        
        
//        //Begin demo with 2 object
//        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//        HelloWorld h2 = (HelloWorld) context.getBean("hello");
//        HelloWorld h = (HelloWorld) context.getBean("hello");
//        h.setName("Truong");
//        h2.helloMess2();
//        h.helloMess2();
//        //End demo with 2 object
    }
}
