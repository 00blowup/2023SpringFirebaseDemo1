package com.example.demo.repository;

import com.example.demo.domain.User;

import java.util.Optional;

public interface UserRepository {

    User save (User user);  //새 유저 객체를 저장하는 메소드. 저장에 성공한 유저 객체를 반환한다(확인용).
    Optional<User> findById(Long id);   //id를 기준으로 유저 정보 하나를 찾아오는 메소드.
    void delete(Long id);   //id를 기준으로 유저 정보 하나를 삭제하는 메소드.
}
