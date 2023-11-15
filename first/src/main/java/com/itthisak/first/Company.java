package com.itthisak.first;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.websocket.OnError;

import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class Company {
    @GetMapping("/employee")
    @ResponseBody
    public String employee(){
        return "Employee";
    }

    @GetMapping("/employee/{id}")
    @ResponseBody
    public String employee(@PathVariable int id) {
        return "Employee ID. "+id;
    }

    @GetMapping("/employee/name/{name}")
    @ResponseBody
    public String employeeName(@PathVariable String name){
        return "Employee Name "+name;
    }

    @GetMapping("/employee/department/{department}")
    @ResponseBody
    public String department(@PathVariable String department){
        return "Employee in "+department;
    }

    // @GetMapping("/employee/{value1}/{value2}")
    // @ResponseBody
    // public String employee(@PathVariable String value1, @PathVariable String value2){
    //     if("name".equals(value1)){
    //         return "Employee Name "+value2;
    //     }else if("department".equals(value1)){
    //         return "Employee in "+value2;
    //     }else{
    //         return "Error";
    //     }
    // }

    @PostMapping("/employee")
    @ResponseBody
    public String employeePost(@RequestBody String name){
        return "Created Employee "+name;
    }
}
