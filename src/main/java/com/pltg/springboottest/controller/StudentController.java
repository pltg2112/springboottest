package com.pltg.springboottest.controller;

import com.pltg.springboottest.entity.Student;
import com.pltg.springboottest.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;


    @GetMapping("/getAll")
    public List<Student> getUser(){
        List<Student> list = studentRepository.findAll();
        return list;
    }

    @PostMapping("/save")
    public String save(@RequestBody Student book){
        Student result = studentRepository.save(book);
        if(result != null){
            return "success";
        }else {
            return "error";
        }
    }
    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id")Integer id){
        studentRepository.deleteById(id);
    }
}
