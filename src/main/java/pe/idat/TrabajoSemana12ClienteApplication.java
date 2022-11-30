package pe.idat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class TrabajoSemana12ClienteApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrabajoSemana12ClienteApplication.class, args);
	}

}
