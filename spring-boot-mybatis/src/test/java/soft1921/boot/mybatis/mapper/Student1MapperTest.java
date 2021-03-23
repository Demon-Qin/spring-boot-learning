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
    void insert() {
        Student1 student1 = Student1.builder()
                .clazzId(1)
                .studentName("test学生")
                .hometown("江苏南京")
                .birthday(LocalDate.of(2000, 10, 10))
                .build();
        int n = student1Mapper.insert(student1);
        assertEquals(n, 1);
    }

    @Test
    void deleteByPrimaryKey() {
    }

    @Test
    void selectByPrimaryKey() {
        Student1 student1 = student1Mapper.selectByPrimaryKey(1);
        assertEquals("金晨星", student1.getStudentName());
    }

    @Test
    void updateByPrimaryKeySelective() {
        Student1 student1 = Student1.builder()
                .studentId(1009)
                .clazzId(2)
                .studentName("新名字")
                .build();
        int n = student1Mapper.updateByPrimaryKeySelective(student1);
        assertEquals(1, n);
    }

    @Test
    void batchInsert() {
        List<Student1> students = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Student1 student1 = Student1.builder()
                    .studentId(3000 + i)
                    .clazzId(1)
                    .studentName("测试学生" + i)
                    .hometown("测试城市")
                    .birthday(LocalDate.of(1999, 10, 10))
                    .build();
            students.add(student1);
        }
        int n = student1Mapper.batchInsert(students);
        assertEquals(10, n);
    }


    @Test
    void batchUpdate() {
        List<Student1> students = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Student1 student1 = Student1.builder()
                    .studentId(3000 + i)
                    .clazzId(1)
                    .studentName("新名字" + i)
                    .build();
            students.add(student1);
        }
        int n = student1Mapper.batchUpdate(students);
        assertEquals(1, n);
    }

    @Test
    void batchDelete() {
        List<Integer> idList = new ArrayList<>();
        idList.add(3001);
        idList.add(3002);
        idList.add(3003);
        int n = student1Mapper.batchDelete(idList);
        assertEquals(3, n);
    }

    @Test
    void selectByDynamicSql() {
        Student1 student = Student1.builder().hometown("江").build();
        List<Student1> students = student1Mapper.selectByDynamicSql(student);
        System.out.println(students);
    }
}