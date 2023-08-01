package mod6.grupal5.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan("mod6.grupal5")
@PropertySource("classpath:database.properties")
public class appConfig {
    Environment environment;

    public appConfig(Environment environment){
        this.environment = environment;
    }

    @Bean
    DataSource dataSource(){
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setUrl(environment.getProperty("url"));
        driverManagerDataSource.setUsername(environment.getProperty("user"));
        driverManagerDataSource.setPassword(environment.getProperty("password"));
        driverManagerDataSource.setDriverClassName(environment.getProperty("driver"));
        return driverManagerDataSource;
    }
}
