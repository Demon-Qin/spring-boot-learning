package soft1921.spring.boot.mbp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"soft1921.spring.boot.mbp.mapper"})
public class SpringbootMbpApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMbpApplication.class, args);
    }

}
