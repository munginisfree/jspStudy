package com.jsp.repository;

import com.jsp.entity.Dancer;

import java.util.ArrayList;
import java.util.List;

// 역할: 메모리데이터베이스에 댄서들을 CRUD(저장조회수정삭제)
// Model
public class DancerMemoryRepo {
    //객체 하나로 고정 - new 를 막으려고
    private static DancerMemoryRepo repo = new DancerMemoryRepo();
    //singleton 구현
    private DancerMemoryRepo(){}

    // 싱글 객체를 리턴하는 method
    public static DancerMemoryRepo getInstance(){
        return repo;
    }
    // 데이터베이스 역할을 할 자료구조
    private List<Dancer> dancerList =new ArrayList<>();

    // 댄서를 데이터베이스에 저장하는 기능
    public boolean save(Dancer dancer){
        if(dancer == null) return false;
        dancerList.add(dancer);
        System.out.println("dancerList = " + dancerList);
        return true;
    }

    //댄서 리스트를 반환하는 기능
    public List<Dancer> retrieve() {
        return dancerList;
    }
}
