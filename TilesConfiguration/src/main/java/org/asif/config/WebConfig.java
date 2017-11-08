package org.asif.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

@Configuration
@EnableWebMvc						//Enable Spring MVC
@ComponentScan("org.asif.web")			//Enable component-scanning
public class WebConfig extends WebMvcConfigurerAdapter{

	
	//configure static resources
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
	    registry
	      .addResourceHandler("/resources/**")
	      .addResourceLocations("/resources/");
	 }
	
	//configurer tiles xml file
	@Bean
	public TilesConfigurer tilesConfigurer(){
		
		TilesConfigurer tilesConfigurer = new TilesConfigurer();
		tilesConfigurer.setDefinitions(new String[] {"/WEB-INF/layout/tiles.xml"});
		tilesConfigurer.setCheckRefresh(true);
		return tilesConfigurer;
		
	}
	
	
	//Configure a Tiles view resolver
	@Bean
	public ViewResolver viewResolver(){
		return new TilesViewResolver();
	}
	
	//configure static content handling
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer){
		configurer.enable();
	}
}
