package soft1921.boot.mybatis.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

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
        private LocalDate birthday;

    }

