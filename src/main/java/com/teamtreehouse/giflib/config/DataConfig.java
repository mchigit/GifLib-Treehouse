package com.teamtreehouse.giflib.config;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;
import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * Created by MICHAELChi on 2017-07-28.
 */

@Configuration
@PropertySource("app.properties")
public class DataConfig {

    @Autowired
    private org.springframework.core.env.Environment env;

    @Bean
    public LocalSessionFactoryBean sessionFactory() {
        org.springframework.core.io.Resource config = new ClassPathResource("hibernate.cfg.xml");
        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        sessionFactory.setConfigLocation(config);
        sessionFactory.setPackagesToScan(env.getProperty("giflib.entity.package"));
        sessionFactory.setDataSource(dataSource());
        return sessionFactory;
    }

    @Bean
    public DataSource dataSource() {
        BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName(env.getProperty("giflib.db.driver"));
        ds.setUrl(env.getProperty("giflib.db.url"));
        ds.setUsername(env.getProperty("giflib.db.username"));
        ds.setPassword(env.getProperty("giflib.db.password"));
        return ds;
    }

}
