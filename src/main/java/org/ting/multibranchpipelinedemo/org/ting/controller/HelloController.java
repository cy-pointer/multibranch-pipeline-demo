package org.ting.multibranchpipelinedemo.org.ting.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Stack;
import java.util.regex.Matcher;

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

    /**
     * 字符串反转，输入I am  a  boy. 输出 .boy  a  am I
     * @param str
     * @return
     */
    public static String reverse(String str) {
        char[] chars = str.toCharArray();
        StringBuilder outStr = new StringBuilder();
        Stack<Object> outputStack = new Stack<>();
        Stack<Object> transitStack = new Stack<>();
        for (char aChar : chars) {
            if (Character.isLetter(aChar)) {
                transitStack.push(aChar);
            } else {
                while (!transitStack.empty()) {
                    outputStack.push(transitStack.pop());
                }
                outputStack.push(aChar);
            }
        }
        while (!outputStack.empty()) {
            outStr.append(outputStack.pop());
        }
        return outStr.toString();
    }

    public static void main(String[] args) {
        String bb = "I am  a  boy.@";
        System.out.println(reverse(bb));
        String cc = "I am  a  boy, hello world!";
        System.out.println(reverse(cc));
    }
}
