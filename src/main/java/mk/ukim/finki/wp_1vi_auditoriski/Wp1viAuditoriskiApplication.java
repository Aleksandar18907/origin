package mk.ukim.finki.wp_1vi_auditoriski;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class Wp1viAuditoriskiApplication {

    public static void main(String[] args) {
        SpringApplication.run(Wp1viAuditoriskiApplication.class, args);
    }

}
