package com.oviya.Configuration;

import java.util.Locale.Category;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.oviya.models.Authorities;
import com.oviya.models.BillingAddress;
import com.oviya.models.Customer;
import com.oviya.models.Product;
import com.oviya.models.ShippingAddress;
import com.oviya.models.User;

@Configuration
@EnableTransactionManagement   //commit / rollback

public class DBConfiguration {
public DBConfiguration() {
	System.out.println("DBConfiguration bean is created");
}
@Bean(name="DataSource")
public DataSource getDataSource() {
	System.out.println("Entering DataSource Bean creation method ");
    BasicDataSource dataSource = new BasicDataSource();
    dataSource.setDriverClassName("org.h2.Driver");
    dataSource.setUrl("jdbc:h2:tcp://localhost/~/project1");
    dataSource.setUsername("sa");
    dataSource.setPassword("");
    System.out.println("DataSource bean " +dataSource);
    return dataSource;
	
}
@Bean
public SessionFactory sessionFactory() {
	System.out.println("Entering sessionFactory creation method");
	LocalSessionFactoryBuilder lsf=new LocalSessionFactoryBuilder(getDataSource());
	Properties hibernateProperties=new Properties();
	hibernateProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
	hibernateProperties.setProperty("hibernate.hbm2ddl.auto", "update");
	hibernateProperties.setProperty("hibernate.show_sql", "true");
	lsf.addProperties(hibernateProperties);
	//An array of Class objects of all the entities
	//Map all entities to relational table
	Class classes[]=new Class[]{Product.class,Category.class,BillingAddress.class,ShippingAddress.class,User.class,Customer.class,Authorities.class}; //If product class is not yet created, remove this and add it later
	//localsesionfactorybuilder -> sessionfactory -> map all entities with relation table
	System.out.println("SessionFactory bean " + lsf);
    return lsf.addAnnotatedClasses(classes).buildSessionFactory();

}
@Bean
public HibernateTransactionManager hibernateTransactionManager() {
	return new HibernateTransactionManager(sessionFactory());

}
}
