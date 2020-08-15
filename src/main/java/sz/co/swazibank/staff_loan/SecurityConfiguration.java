package sz.co.swazibank.staff_loan;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.ldap.authentication.ad.ActiveDirectoryLdapAuthenticationProvider;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests()
		    .antMatchers("/", "/login", "/setuprest/**").permitAll()
				.anyRequest().fullyAuthenticated()
				.and()
			.formLogin();
	}

	@Bean
	public ActiveDirectoryLdapAuthenticationProvider activeDirectoryLdapAuthenticationProvider(){
		ActiveDirectoryLdapAuthenticationProvider activeDirectoryLdapAuthenticationProvider = new
				ActiveDirectoryLdapAuthenticationProvider("swazibank.co.sz", "ldap://172.16.1.16:389/");
		return activeDirectoryLdapAuthenticationProvider;
	}

}
