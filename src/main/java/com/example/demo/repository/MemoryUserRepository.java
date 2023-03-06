package com.example.demo.repository;

import com.example.demo.domain.User;

import java.util.HashMap;
import java.util.Optional;

public class MemoryUserRepository implements UserRepository{

    private HashMap<Long, User> store = new HashMap<>();    //User 객체들이 저장될 메모리 상의 저장소 (해시맵)
    private long sequence = 0L; //순차부여되는 아이디의 값을 결정하기 위한 변수

    @Override
    public User save(User user) {
        user.setId(++sequence); //아이디 부여
        store.put(user.getId(), user);  //해시맵에 객체를 저장
        return user;    //무슨 객체를 저장했는지 리턴
    }

    @Override
    public Optional<User> findById(Long id) {
        return Optional.ofNullable(store.get(id));  //특정 id를 가진 객체가 해시맵에 존재할 경우 그 객체를 리턴
        //그런 객체가 존재하지 않는다면 빈 Optional을 리턴
    }

    @Override
    public void delete(Long id) {
        store.remove(id);   //특정 id를 가진 객체를 해시맵에서 삭제함
    }

    //해시맵을 싹 비워야 할 때 사용할 초기화함수
    public void clearStore() {
        store.clear();
    }
}
