/**
 * 
 */
package com.sk.jobseekers.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author shifa kaushar
 *
 */
@Configuration
public class SecurityConfiguaration extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		auth.inMemoryAuthentication()
		.withUser("shifa")
		.password("1234")
		.roles("user")
		.and()
		.withUser("kapil")
		.password("123")
		.roles("Admin");
		
		
	}
//	//deprecated should be replaced
			@Bean
			public PasswordEncoder getPasswordEncoder() {
				
				
				return new PasswordEncoder() {

					@Override
					public String encode(CharSequence rawPassword) {
						// TODO Auto-generated method stub
						return rawPassword.toString();
					}

					@Override
					public boolean matches(CharSequence rawPassword, String encodedPassword) {
						//encodedPassword convert to decoded char sequence 
						//then match rawPassword and decodedPassword resulting true or false
					return true;
						}
	
	 };
}
			@Override
			protected void configure(HttpSecurity http) throws Exception {
				http.authorizeRequests()
				.antMatchers("/api/**").hasAnyRole("Admin")
				.and().formLogin();	
				
			}
}
