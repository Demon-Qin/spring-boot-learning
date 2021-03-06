package online.daobao.boot.config.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author 囧态汗
 * @date 2021/3/23
 * @description Child
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Component
//@ConfigurationProperties(prefix = "family.child")
public class Child {
    //  @Value("${family.child.name}")
    private String name;
    //  @Value("${family.child.age}")
    private Integer age;

    //    private List <Map<String,Object>> friends;
    private List<Friend> friends;

}