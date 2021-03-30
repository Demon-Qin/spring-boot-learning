package soft1921.boot.mybatis.mapper;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import soft1921.boot.mybatis.domain.Student1;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class StudentMapperTest {
    @Resource
    private Student1Mapper student1Mapper;

   @Test
    void getStudentManyToOne() {
       Student1 student1 = student1Mapper.getStudentManyToOne(1);
       System.out.println(student1);
   }
}