package work.com.zuul.serverofzuul.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import javax.servlet.http.HttpServletResponse;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
public class SecurityTokenConfig extends WebSecurityConfigurerAdapter {
//    @Autowired
//    private JwtConfig jwtConfig;
//
//    @Bean
//    public JwtConfig jwtConfig() {
//        return new JwtConfig();
//    }
}
