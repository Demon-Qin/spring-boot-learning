package online.daobao.boot.config.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import online.daobao.boot.config.conf.MixPropertySourceFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

/**
 * @author 囧态汗
 * @date 2021/3/23
 * @description Family
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Component
@Validated
//@PropertySource(value = {"classpath:family.properties"})
@PropertySource(value = {"classpath:family.yml"},factory = MixPropertySourceFactory.class)
@ConfigurationProperties(prefix = "family")
public class Family {

    // @Value("${family.family-name}")
    private String familyName;
    //  @Resource
    private Father father;
    //  @Resource
    private Mother mother;
    //  @Resource
    private Child child;

}