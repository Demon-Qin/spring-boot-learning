package soft1921.boot.mybatis.mapper;

import soft1921.boot.mybatis.domain.Course;

import java.util.List;

public interface CourseMapper {
   List<Course> selectAll();
}