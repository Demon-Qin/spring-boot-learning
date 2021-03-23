package online.daobao.boot.config.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author 囧态汗
 * @date 2021/3/23
 * @description Father
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Father {
    //    @Value("${family.father.name}")
    private String name;

//    @Value("${family.father.age}")
    private Integer age;
}