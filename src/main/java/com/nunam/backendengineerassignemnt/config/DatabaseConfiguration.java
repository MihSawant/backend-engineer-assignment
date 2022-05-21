package com.nunam.backendengineerassignemnt.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfiguration {

    @Configuration
    @Profile("prod")
    @PropertySource("application-prod.properties")
    static class ProductionDatabaseConfig{
        @Bean
        public DataSource prodDb(
                @Value("${spring.datasource.url}")
                String url,
                @Value("${spring.datasource.username}")
                String username,
                @Value("${spring.datasource.password}")
                String password){
            return new DriverManagerDataSource(url, username, password);
        }
    }


    @Configuration
    @Profile("dev")
    @PropertySource("application-dev.properties")
    static class DevelopmentDatabaseConfig{

        @Bean
        public DataSource devDb(){
            return new EmbeddedDatabaseBuilder()
                    .setType(EmbeddedDatabaseType.H2).build();

        }
    }

}
