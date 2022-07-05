/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nnt.configutils;

import com.nnt.pojo.Category;
import com.nnt.pojo.Manufacturer;
import com.nnt.pojo.Product;
import java.util.Properties;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtils {

    private static final SessionFactory FACTORY;

    static {
        Configuration config = new Configuration();
        Properties properties = new Properties();

        properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
        properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
        properties.put(Environment.URL, "jdbc:mysql://localhost/saledb");
        properties.put(Environment.USER, "root");
        properties.put(Environment.PASS, "123456@");
        properties.put(Environment.SHOW_SQL, "true");
        config.setProperties(properties);

        config.addAnnotatedClass(Category.class);
        config.addAnnotatedClass(Product.class);
        config.addAnnotatedClass(Manufacturer.class);

        ServiceRegistry registry = new StandardServiceRegistryBuilder()
                .applySettings(config.getProperties()).build();
        FACTORY = config.buildSessionFactory(registry);
    }

    /**
     * @return the FACTORY
     */
    public static SessionFactory getFACTORY() {
        return FACTORY;
    }
}
