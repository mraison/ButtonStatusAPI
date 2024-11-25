package com.PanicStatus.API;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.autoconfigure.data.cassandra.CassandraDataAutoConfiguration;
// import org.springframework.boot.autoconfigure.cassandra.CassandraProperties;

@SpringBootApplication()
// @EnableConfigurationProperties(CassandraProperties.class)
@EnableCassandraRepositories
// @EnableCassandraRepositories(basePackages="com.PanicStatus.API.PanicStatusRepository")
public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

}
