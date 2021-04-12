package com.intentsg.service.user.repository;

import com.intentsg.service.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    
    @Transactional
    @Modifying
    @Query("update User u set u.balance= :balance where u.id= :id")
    public void changeUserBalanceDB(@Param("id") String id, @Param("balance") int balance);

}
