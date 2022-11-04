package com.securelogin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SuppressWarnings("deprecation")
@EnableWebSecurity
public class secureConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	UserDetailsService userDetailsService;

	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		//auth.userDetailsService(userDetailsService);
		auth.inMemoryAuthentication().withUser("bachi").password("2505").roles("USER")
		.and().withUser("hello").password("2505").roles("ADMIN");
	}
	
	@Bean 
	public PasswordEncoder getPaswordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
		
	protected void configure(HttpSecurity http) throws Exception {
	
		http.authorizeRequests()
		.antMatchers("/user").hasRole("USER")
		.antMatchers("/admin").hasRole("ADMIN")
		.antMatchers("/").permitAll().and().formLogin();
		
	}
	
	
}
