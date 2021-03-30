package soft1921.boot.mybatis.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Clazz {
    /**
    * 教师id
    */
    @JsonIgnore
    private Integer clazzId;

    /**
    * 教师姓名
    */
    private String clazzName;

    /**
    * 班级管理老师的id
    */
    @JsonIgnore
    private Integer teacherId;

    /*
    * 管理班级的教师对象
    * */
    private Teacher teacher;

    /*
    * 一方声明多方集合
    * */
    private List<Student1> students;


}