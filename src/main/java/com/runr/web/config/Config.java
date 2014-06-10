package com.runr.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

// dispatcher-servlet

public class Config {
	@Bean
	 public UrlBasedViewResolver setupViewResolver() {
	 UrlBasedViewResolver resolver = new UrlBasedViewResolver();
	 resolver.setPrefix("/WEB-INF/views/");
	 resolver.setSuffix(".jsp");
	 resolver.setViewClass(JstlView.class);
	 return resolver;
	 }
}
