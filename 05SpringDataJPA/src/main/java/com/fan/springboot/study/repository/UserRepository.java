package com.fan.springboot.study.repository;


import com.fan.springboot.study.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {

    User findByName(String name);

    User findByNameAndAge(String name, Integer age);

//    @Query(value = "from User u where u.name=:name")
//    User findUser(@Param("name") String name);

}
