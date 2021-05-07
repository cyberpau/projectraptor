package com.cyberpau.projectraptor.repository;

import com.cyberpau.projectraptor.model.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserAccountRepository extends JpaRepository<UserAccount, Long> {
    Optional<UserAccount> findUserAccountById(Long id);

    void deleteUserAccountById(Long id);
}
