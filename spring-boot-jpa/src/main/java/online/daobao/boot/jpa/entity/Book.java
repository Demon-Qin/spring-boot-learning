package online.daobao.boot.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author 囧态汗
 * @date 2021/3/23
 * @description Book
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity

@Table(name = "t_book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String cover;


}
