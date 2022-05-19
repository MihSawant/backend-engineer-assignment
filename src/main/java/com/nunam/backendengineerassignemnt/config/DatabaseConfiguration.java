package com.nunam.backendengineerassignemnt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfiguration {

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
