package com.javafullstackguru.batchprocessingcsvtodatabase.repository;

import com.javafullstackguru.batchprocessingcsvtodatabase.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {

}
