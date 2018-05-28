package sps;

import javax.sql.DataSource;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SPSapp {

	public static void main(String[] args) {
		SpringApplication.run(SPSapp.class, args);

	}
	
	@Bean
	public KieContainer kieContainer() {
		KieContainer kc = KieServices.Factory.get().getKieClasspathContainer();
		SPSutil.setKieContainer(kc);
		return kc;
	}

	@Bean
	@ConfigurationProperties("app.datasource")
	public DataSource dataSource() {
		DataSource my = DataSourceBuilder.create().build();
		SPSutil.setDataSource(my);
		return my;
	}		
}
