/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.nnt.onlinehibernatehqldemo;

import com.nnt.configutils.HibernateUtils;
import com.nnt.pojo.Category;
import com.nnt.pojo.Manufacturer;
import com.nnt.pojo.Product;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.hibernate.Session;

public class OnlineHibernateHQLDemo {
    public static void main(String[] args) {
        
//        //Begin demo UPDATE HQL
//        try ( Session session = HibernateUtils.getFACTORY().openSession()) {
//            Query query5 = session.createQuery("UPDATE Category c SET c.name=:name WHERE c.id=:id");
//            query5.setParameter("name", "Smart phone");
//            query5.setParameter("id", 1);
//            session.getTransaction().begin();
//            query5.executeUpdate();
//            session.getTransaction().commit();
//            session.close();
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//        //End demo UPDATE HQL
        
        
        
        
        
//        //Begin demo HQL Right outer join
//        try ( Session session = HibernateUtils.getFACTORY().openSession()) {
//            Query query4 = session.createQuery("SELECT c.name, count(p.id), max(p.price), min(p.price)"
//                    + "FROM Product p RIGHT OUTER JOIN Category c ON p.category = c.id "
//                    + "GROUP BY c.name ORDER BY p.price desc");
//            List<Object[]> result = query4.getResultList();
//            result.forEach(r -> System.out.printf("Name: %s - Count id: %d - Max: %.2f - Min: %.2f\n",
//                    r[0], r[1], r[2], r[3]));
//            session.close();
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//        //End demo HQL Right outer join --> run successful
        
        
        
        
        
//        //Begin demo select data with .setParameter HQL
//        try ( Session session = HibernateUtils.getFACTORY().openSession()) {
//            Query query3 = session.createQuery("SELECT p.id, p.name, p.price FROM Product p WHERE p.name LIKE :keyword ORDER BY p.id DESC");
//            query3.setParameter("keyword", "%iPhone%");
//            List<Object[]> objectProductlist2 = query3.getResultList();
//            objectProductlist2.forEach(p -> System.out.printf("%d - %s - %.2f\n", p[0], p[1], p[2]));
//            session.close();
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//        //End demo select data with .setParameter HQL --> run successful
        
        
        
        
        
//        //Begin demo HQL Select 2
//        try ( Session session = HibernateUtils.getFACTORY().openSession()) {
//            Query query2 = session.createQuery("SELECT p.id, p.name, p.price FROM Product p");
//            List<Object[]> objectProductList = query2.getResultList();
//            objectProductList.forEach(pl -> System.out.printf("%d - %s - %.2f\n", pl[0], pl[1], pl[2]));
//            session.close();
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//        //End demo HQL Select 2 --> run successful
        
        
        
        
        
//        //Begin demo HQL select
//        try(Session session = HibernateUtils.getFACTORY().openSession()){
//            Query query1 = session.createQuery("FROM Product");
//            List<Product> productList = query1.getResultList();
//            productList.forEach(p -> System.out.printf("%d - %s - %.2f\n", p.getId(), p.getName(), p.getPrice()));
//            session.close();
//        }catch(Exception ex){
//            ex.printStackTrace();
//        }
//        //End demo HQL select --> run successful
        
        
        
        
        
//        //Begin demo select data with count, max
//        try ( Session session = HibernateUtils.getFACTORY().openSession()) {
//            CriteriaBuilder builder = session.getCriteriaBuilder();
//            CriteriaQuery<Object[]> query = builder.createQuery(Object[].class);
//            Root<Product> productRoot = query.from(Product.class);
//            Root<Category> categoryRoot = query.from(Category.class);
//            query.where(builder.equal(productRoot.get("category"), categoryRoot.get("id")));
//            query.multiselect(categoryRoot.get("name").as(String.class),
//                    builder.count(productRoot.get("id").as(Integer.class)),
//                    builder.max(productRoot.get("price").as(BigDecimal.class)));
//            query.groupBy(categoryRoot.get("name").as(String.class));
//            query.orderBy(builder.asc(categoryRoot.get("name").as(String.class)));
//            Query q = session.createQuery(query);
//            List<Object[]> kq = q.getResultList();
//            kq.forEach(k -> {
//                System.out.printf("Name: %s - Count: %d - Max: %.2f\n", k[0], k[1], k[2]);
//            });
//            session.close();
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//        //End demo select data with count, max --> run successful
        
        
        
        
        
//        //Begin demo select data with between
//        try ( Session session = HibernateUtils.getFACTORY().openSession()) {
//            CriteriaBuilder builder = session.getCriteriaBuilder();
//            CriteriaQuery<Product> query = builder.createQuery(Product.class);
//            Root root = query.from(Product.class);
//            query = query.select(root);
//            Predicate predicate5 = builder.between(root.get("price").as(BigDecimal.class), new BigDecimal(20000000), new BigDecimal(30000000));
//            query = query.where(predicate5);
//            Query q = session.createQuery(query);
//            List<Product> productList = q.getResultList();
//            productList.forEach(p -> System.out.printf("%d - %s - %.2f\n", p.getId(), p.getName(), p.getPrice()));
//            session.close();
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//        //End demo select data with between --> run successful
        
        
        
        
        
//        //Begin demo select data with price not use between
//        try ( Session session = HibernateUtils.getFACTORY().openSession()) {
//            CriteriaBuilder builder = session.getCriteriaBuilder();
//            CriteriaQuery<Product> query = builder.createQuery(Product.class);
//            Root root = query.from(Product.class);
//            query = query.select(root);
//            Predicate predicate3 = builder.greaterThanOrEqualTo(root.get("price").as(BigDecimal.class), new BigDecimal(20000000));
//            Predicate predicate4 = builder.lessThanOrEqualTo(root.get("price").as(BigDecimal.class), new BigDecimal(30000000));
//            query = query.where(builder.and(predicate3, predicate4));
//            Query q = session.createQuery(query);
//            List<Product> productList = q.getResultList();
//            productList.forEach(p -> System.out.printf("%d - %s - %.2f\n", p.getId(), p.getName(), p.getPrice()));
//            session.close();
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//        //End demo select data with price not use between --> run successful
        
        
        
        
//        //Begin demo select product with Criterial Query API, where content contants String
//        try ( Session session = HibernateUtils.getFACTORY().openSession()) {
//            CriteriaBuilder builder = session.getCriteriaBuilder();
//            CriteriaQuery<Product> query = builder.createQuery(Product.class);
//            Root root = query.from(Product.class);
//            query = query.select(root);
//            Predicate predicate1 = builder.like(root.get("name").as(String.class), "%Galaxy%");
//            Predicate predicate2 = builder.like(root.get("name").as(String.class), "%iPhone%");
//            query = query.where(builder.or(predicate1, predicate2));
//            Query q = session.createQuery(query);
//            List<Product> productList = q.getResultList();
//            productList.forEach(p -> System.out.printf("%d - %s\n", p.getId(), p.getName()));
//            session.close();
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//        //End demo select product with Criterial Query API, where content contants String --> run successful
        
        
        
        
        
//        //Begin Demo @ManyToMany
//        try ( Session session = HibernateUtils.getFACTORY().openSession()) {
//            Product p = new Product();
//            p.setName("New Tablet 2023");
//            p.setPrice(new BigDecimal(35000000));
//            Category c = session.get(Category.class, 2);
//            p.setCategory(c);
//            Set<Manufacturer> manuf = new HashSet<>();
//            manuf.add(session.get(Manufacturer.class, 1));
//            manuf.add(session.get(Manufacturer.class, 2));
//            p.setManufacturerSet(manuf);
//            session.getTransaction().begin();
//            session.save(p);
//            session.getTransaction().commit();
//            session.close();
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//        //End Demo @ManyToMany --> run successful
        
        
        
        
        
//        //Begin demo get product of manufacturer with manufacturer.id
//        try ( Session session = HibernateUtils.getFACTORY().openSession()) {
//            Manufacturer m = session.get(Manufacturer.class, 1);
//            m.getProducts().forEach(p -> System.out.printf("%d - %s\n", p.getId(), p.getName()));
//            session.close();
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//        //End demo get product of manufacturer with manufacturer.id --> run successful
        
        
        
        
        
//        //Begin demo select data into Category class where primary key is 1
//        try ( Session session = HibernateUtils.getFACTORY().openSession()) {
//            Category category = session.get(Category.class, 1);
//            category.getProduct().forEach(p
//                    -> System.out.printf("%d - %s - %s\n", p.getId(), p.getName(),
//                            p.getCategory().getName()));
//            session.close();
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//        //End demo select data into Category class where primary key is 1 --> run successful
        
                
                
                
                
//        //Begin demo select data into saledb use HQL
//        try ( Session session = HibernateUtils.getFACTORY().openSession()) {
//            Query query = session.createQuery("FROM Category");
//            List<Category> categoryList = query.getResultList();
//            categoryList.forEach(c -> System.out.printf("%d - %s - %s\n",
//                    c.getId(), c.getName(), c.getDescription()));
//            session.close();
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//        //End demo select data into saledb use HQL --> run successful
        
        
        
        
        
//        //Begin demo update description into saledb
//        try ( Session session = HibernateUtils.getFACTORY().openSession()) {
//            Category category2 = session.get(Category.class, 6);
//            category2.setDescription("Update content discription");
//            session.getTransaction().begin();
//            session.save(category2);
//            session.getTransaction().commit();
//            session.close();
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//        //End demo update description into saledb --> run successful





//        //Begin demo insert data into saledb
//        try ( Session session = HibernateUtils.getFACTORY().openSession()) {
//            Category category = new Category();
//            category.setName("Phu kien 2");
//            category.setDescription("Demo insert data");
//            session.getTransaction().begin();
//            session.save(category);
//            session.getTransaction().commit();
//            session.close();
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//        //End demo insert data into saledb --> run successful
    }
}
