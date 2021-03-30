package soft1921.spring.boot.mbp.Mapper;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import soft1921.spring.boot.mbp.entity.User;

import javax.annotation.Resource;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class UserMapperTest {
    @Resource
            private UserMapper userMapper;
    @Test
            void save(){
        User user = User.builder().name("Mark").age(20).email("mark@baomidou.com").build();

        int row = userMapper.insert(user);
        assertEquals(1, row);

        System.out.println("雪花算法id: " + user.getId());
    }
    @Test
            void deleteById(){
        int rows = userMapper.deleteById("1376708549812117505");
        System.out.println("删除"+ rows);
    }

    @Test
            void  selectById(){
        List<Long> ids = Arrays.asList(
                1376708549812117505L,
                1376712023996067841L,
                1376711552099102721L
        );
        List<User> list = userMapper.selectBatchIds(ids);
        list.forEach(System.out::println);

    }

}