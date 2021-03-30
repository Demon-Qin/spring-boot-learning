package soft1921.boot.mybatis.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import soft1921.boot.mybatis.controller.dto.AjaxResponse;
import soft1921.boot.mybatis.mapper.Student1Mapper;

import javax.annotation.Resource;

/**
 * @author admin
 * @date 2021/3/25
 * @description StudentController
 */
@RestController
@RequestMapping(value = "api/v1/student1")
@Slf4j
@Validated
public class StudentController {
    @Resource
    private Student1Mapper student1Mapper;

    @GetMapping("{studentId}")
    public AjaxResponse getStudent(@PathVariable("studentId") int studentId) {
        return  AjaxResponse.success(student1Mapper.getStudentManyToOne(studentId));
    }
}