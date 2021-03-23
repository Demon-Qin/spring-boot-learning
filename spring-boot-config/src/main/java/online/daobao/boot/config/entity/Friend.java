package online.daobao.boot.config.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 囧态汗
 * @date 2021/3/23
 * @description Friend
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Friend {
    private String hobby;
    private String gender;
}