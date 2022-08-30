package com.simplilearn.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter{
@Override
protected void configure(HttpSecurity http) throws Exception {
	// TODO Auto-generated method stub
  http
  .csrf().disable()
  .authorizeRequests()
  .antMatchers("/user/**").hasRole("Role_User")
  .antMatchers("/admin/**").hasRole("Admin")
  .anyRequest()
  .authenticated()
  .and()
  .httpBasic();
}

@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("user").password(this.passwordEncoder().encode("user")).roles("Role_User");
		auth.inMemoryAuthentication().withUser("Admin").password(this.passwordEncoder().encode("Admin")).roles("Admin");
	}

@Bean
public PasswordEncoder passwordEncoder() {
	return new BCryptPasswordEncoder(10);
}
}
