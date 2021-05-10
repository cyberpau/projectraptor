package com.cyberpau.projectraptor.controller;

import com.amazonaws.services.xray.model.Http;
import com.cyberpau.projectraptor.model.UserAccount;
import com.cyberpau.projectraptor.service.UserAccountService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserAccountResource {
    private final UserAccountService userAccountService;

    public UserAccountResource(UserAccountService userAccountService) {
        this.userAccountService = userAccountService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<UserAccount>> getAllUserAccounts() {
        List<UserAccount> userAccounts = userAccountService.findAllUserAccount();
        return new ResponseEntity<>(userAccounts, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<UserAccount> getUserAccountById(@PathVariable("id") Long id) {
        UserAccount userAccount = userAccountService.findUserAccountById(id);
        return new ResponseEntity<>(userAccount, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<UserAccount> addUserAccount(@RequestBody UserAccount userAccount) {
        UserAccount newUserAccount = userAccountService.addUserAccount(userAccount);
        return new ResponseEntity<>(newUserAccount, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<UserAccount> updateUserAccount(@RequestBody UserAccount userAccount) {
        UserAccount updateUserAccount = userAccountService.updateUserAccount(userAccount);
        return new ResponseEntity<>(updateUserAccount, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteUserAccount(@PathVariable("id") Long id) {
        userAccountService.deleteUserAccount(id);
        return new ResponseEntity(HttpStatus.OK);
    }
}
