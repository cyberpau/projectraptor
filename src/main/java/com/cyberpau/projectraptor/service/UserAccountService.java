package com.cyberpau.projectraptor.service;

import com.cyberpau.projectraptor.exception.UserNotFoundException;
import com.cyberpau.projectraptor.model.UserAccount;
import com.cyberpau.projectraptor.repository.UserAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserAccountService {
    private final UserAccountRepository userAccountRepository;

    @Autowired
    public UserAccountService(UserAccountRepository userAccountRepository) {
        this.userAccountRepository = userAccountRepository;
    }

    public UserAccount addUserAccount(UserAccount userAccount) {
        return userAccountRepository.save(userAccount);
    }

    public List<UserAccount> findAllUserAccount() {
        return userAccountRepository.findAll();
    }

    public UserAccount findUserAccountById(Long id) {
        return userAccountRepository.findUserAccountById(id).orElseThrow(
                () -> new UserNotFoundException("User account by id " + id + " not found."));
    }

    public UserAccount updateUserAccount(UserAccount userAccount) {
        return userAccountRepository.save(userAccount);
    }

    public void deleteUserAccount(Long id) {
        userAccountRepository.deleteUserAccountById(id);
    }
}
