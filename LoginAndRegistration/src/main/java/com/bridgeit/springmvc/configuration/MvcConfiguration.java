package com.bridgeit.springmvc.configuration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.bridgeit.springmvc.dao.UserDao;
import com.bridgeit.springmvc.dao.UserDaoImpl;
import com.bridgeit.springmvc.service.IService;
import com.bridgeit.springmvc.service.ServiceImpl;

@Configuration
@ComponentScan(basePackages="com.bridgeit.springmvc")
@EnableWebMvc
public class MvcConfiguration extends WebMvcConfigurerAdapter{

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**")
                        .addResourceLocations("/resources/");
	}

   @Bean
   public DataSource getDataSource() {
       DriverManagerDataSource dataSource = new DriverManagerDataSource();
       dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
       dataSource.setUrl("jdbc:mysql://localhost:3306/Spring");
       dataSource.setUsername("root");
       dataSource.setPassword("1234");
        
       return dataSource;
   }
    
   @Bean
   public UserDao getUserDao() {
       return new UserDaoImpl(getDataSource());
   }
   
   @Bean
   public IService getIService() {
       return new ServiceImpl();
   }
}
