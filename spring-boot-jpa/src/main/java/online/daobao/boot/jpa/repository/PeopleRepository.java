package online.daobao.boot.jpa.repository;

import online.daobao.boot.jpa.entity.People;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.relational.core.sql.In;

import java.util.List;

public interface PeopleRepository extends JpaRepository<People, Integer> {
    @Override
    List<People> findAll();

    //根据firstname
    List<People> findByFirstName(String firstName);

    //根据firstName和LastName
    People findByLastNameAndFirstName(String firstName ,String lastName );

    //根据firstName和LastName查找(有一个就行)
    People findByLastNameOrFirstName(String lastName, String firstName);

    //根据firstName或LastName查找
    People findByFirstNameIs(String firstName);

    //根据firstName查找它是否存在数据库里
    People findByFirstNameEquals(String firstName);
}
