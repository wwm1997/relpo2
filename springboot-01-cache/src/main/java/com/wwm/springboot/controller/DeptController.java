//package com.wwm.springboot.controller;
//
//import com.wwm.springboot.bean.Department;
//import com.wwm.springboot.service.DeptService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class DeptController {
//
//    @Autowired
//    DeptService deptService;
//
//    @GetMapping("/dept/{id}")
//    public Department getDept(@PathVariable("id") Integer id){
//        return deptService.getDeptById(id);
//    }
//}
