package rs.engineering.javacourse.springMvcConfiguration03.config;
//konfigurisanje binova u web kontekstu za konkretni dispatcher


import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.handler.BeanNameUrlHandlerMapping;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


import rs.engineering.javacourse.springMvcConfiguration03.controller.HomeController;
import rs.engineering.javacourse.springMvcConfiguration03.controller.UserController;


@Configuration
@EnableWebMvc
public class MyWebContextConfig {
	
	@Bean
	public HomeController homeController() {
		return new HomeController();
	}
	

	@Bean
	public SimpleUrlHandlerMapping simpleUrlHandlerMapping() {
		SimpleUrlHandlerMapping simpleUrlHandlerMapping = new SimpleUrlHandlerMapping();
		
		Map<String, Object> urlMap = new HashMap<String, Object>();
		urlMap.put("/home", homeController());
		urlMap.put("/home/simpleurl", homeController());
		simpleUrlHandlerMapping.setUrlMap(urlMap);
		return simpleUrlHandlerMapping;
	}
	
	@Bean
	BeanNameUrlHandlerMapping beanNameUrlHandlerMapping() {
		return new BeanNameUrlHandlerMapping();
	}
	
	@Bean
	public UserController userController() {
		return new UserController();
	}



	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
}
