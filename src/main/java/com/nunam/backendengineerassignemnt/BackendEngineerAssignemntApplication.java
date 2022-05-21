package com.nunam.backendengineerassignemnt;

import com.nunam.backendengineerassignemnt.repo.CellDetailRepository;
import com.nunam.backendengineerassignemnt.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties
public class BackendEngineerAssignemntApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendEngineerAssignemntApplication.class, args);
	}



}
