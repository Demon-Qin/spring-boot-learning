package soft1921.boot.mybatis.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

/**
 * @authoradmin
 * @date 2021/3/23 21:18
 * @description Student1
 */
    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public class Student1 {
        /**
         * 学生id
         */
        private Integer studentId;

        /**
         * 学生所属班级的id
         */
        @JsonIgnore
        private Integer clazzId;

        /**
         * 学生姓名
         */
        private String studentName;

        /**
         * 学生籍贯
         */

        private String hometown;

        /**
         * 出生日期
         */
        @JsonIgnore
        private LocalDate birthday;

        /*
         * 在多方里声明一方的对象
         * */
        @JsonIgnore
        private Clazz clazz;

        /*
        * 学生和课程多对多
        * */
        @JsonIgnore
        private List<Course> courses;

    }

