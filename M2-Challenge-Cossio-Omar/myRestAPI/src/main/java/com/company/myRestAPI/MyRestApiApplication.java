package com.company.myRestAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyRestApiApplication.class, args);
	}

}

//In the controllers, you need to create your API calls and then test them with Postman.
//Create your SpringFoxConfig class in the same folder as your main app. SpringFox is needed for Swagger.
//Go on Swagger IO and then generate the YAML file. Store the YAML file in the root directory of your project.
