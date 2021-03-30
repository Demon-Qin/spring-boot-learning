package online.daobao.boot.jpa.repository;

import lombok.extern.slf4j.Slf4j;
import online.daobao.boot.jpa.entity.People;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j

class PeopleRepositoryTest {
    @Resource
    private PeopleRepository peopleRepository;

    @Test
    void findAll() {
        List<People> peopleList = peopleRepository.findAll();
        assertEquals(3,peopleList.size());
    }

    @Test
    void findByFirstName() {
        List<People> peopleList = peopleRepository.findByFirstName("zhang");
        assertEquals(1,peopleList.size());
    }

    @Test
    void findByLastNameAndFirstName() {
    }

    @Test
    void findByLastNameOrFirstName() {
    }

    @Test
    void findByFirstNameIs() {
    }

    @Test
    void findByFirstNameEquals() {
    }
}