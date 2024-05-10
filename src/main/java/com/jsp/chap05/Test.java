package com.jsp.chap05;

public class Test {
    public static void main(String[] args) {
        JdbcBasic jdbc = new JdbcBasic();
//        jdbc.insert(new Person(99, "jeongin", 24));
//        jdbc.insert(new Person(199, "hihi", 34));
//        jdbc.insert(new Person(299, "hehe", 29));

//        jdbc.delete(299);
//        jdbc.update(199, "barbie", 35);

        jdbc.findAll();
    }
}
