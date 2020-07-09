package org.ting.multibranchpipelinedemo.org.ting.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sie_zj
 * @create 2020-07-09 9:23
 **/
@RestController
public class HelloController {
    @GetMapping("hello")
    public String hello(String name) {
        System.out.println("hello" + name);
        return "hello" + name;
    }


    public static void main(String[] args) {
        String bb = "I am  a  boy.";
        char[] chars = bb.toCharArray();
        for (int i = chars.length-1; i >=0; i--) {
            System.out.print(chars[i]);
        }
    }
}
