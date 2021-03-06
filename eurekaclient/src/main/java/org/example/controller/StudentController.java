package org.example.controller;

import org.example.dao.StudentDao;
import org.example.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import java.util.Collection;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Value("${server.port}")
    private String port;
    @Autowired
    private StudentDao studentDao;
    @GetMapping("/findAll")
    public Collection <Student> findAll(){
        return studentDao.findAll();
    }
    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") Long id){
        return studentDao.findById(id);
    }
    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") Long id){
        studentDao.deleteById(id);
    }
    @PostMapping("/save")
    public void save(@RequestBody Student student){
        studentDao.save(student);
    }
    @PutMapping("/update")
    public void update(@RequestBody Student student){
        studentDao.update(student);
    }
    @GetMapping("/index")
    public String index(){
        return "当前端口"+port;
    }
}
