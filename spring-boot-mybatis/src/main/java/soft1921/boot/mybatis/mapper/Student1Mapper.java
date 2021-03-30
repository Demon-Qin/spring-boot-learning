package soft1921.boot.mybatis.mapper;

import org.apache.ibatis.annotations.Param;
import soft1921.boot.mybatis.domain.Student1;

import java.util.List;

public interface Student1Mapper {
    /*
     * clazzId
     * 查询到的班级对象
     * */
    Student1 getStudentManyToOne(int studentId);
//    Student1 getStudent(int studentId);
}