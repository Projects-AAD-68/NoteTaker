package lk.ijse.gdse.aad68.notetaker.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = "lk.ijse.gdse.aad68.notetaker")
@EnableWebMvc
@EnableJpaRepositories(basePackages = "lk.ijse.gdse.aad68.notetaker")
@EnableTransactionManagement
public class WebAppConfig {
}
