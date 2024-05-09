package com.example.demo;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		/**
		 * Ошибка номер раз: из-за автоматической конфигурации SpringBoot приложений,
		 * компилятор после выключения встроенного Tomcat падает в ошибку, а точнее
		 * Exception in thread "main" java.lang.NoClassDefFoundError: org/springframework/boot/SpringApplication
		 *
		 */
		//SpringApplication.run(DemoApplication.class, args);

		SpringApplication app = new SpringApplication(DemoApplication.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.setLazyInitialization(true);
		app.setWebApplicationType(WebApplicationType.NONE); // вот эта строчка говорит в каком режиме запускать приложение
		app.run(args);
	}

}
