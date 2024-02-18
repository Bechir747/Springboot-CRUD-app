package com.example.banking.controller;

import com.example.banking.dto.AccountDto;
import com.example.banking.service.AccountService;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/accounts")
//@SecurityRequirement(name = "Keycloak")
public class AccountController {
    @Autowired
    private AccountService accountService;

    public AccountController(AccountService accountService){
        this.accountService = accountService;
    }

    // Add Account REST API
    @PostMapping("/add")
//    @PreAuthorize("hasRole('admin')")
    //@PreAuthorize("permitAll()")
    public ResponseEntity<AccountDto> addAccount(@RequestBody AccountDto accountDto){
        return new ResponseEntity<>(accountService.createAccount(accountDto), HttpStatus.CREATED);
    }

    //Get Account REST API
    @GetMapping("/{id}")
//    @PreAuthorize("hasRole('admin')")
    public ResponseEntity<AccountDto> getAccount(@PathVariable long id){
        AccountDto accountDto = accountService.getAccountById(id);
        return ResponseEntity.ok(accountDto);
    }

    //Deposit REST API
    @PutMapping("/deposit/{id}")
//    @PreAuthorize("hasRole('owner')")
    public ResponseEntity<AccountDto> deposit(@PathVariable long id,@RequestBody Map<String, Double> request){
        double amount = request.get("amount");
        AccountDto accountDto = accountService.deposit(id, amount);
        return ResponseEntity.ok(accountDto);
    }
    //Withdraw REST API
    @PutMapping("/withdraw/{id}")
//    @PreAuthorize("hasRole('owner')")
    public ResponseEntity<AccountDto> withdraw(@PathVariable long id,@RequestBody Map<String, Double> request) {
        double amount = request.get("amount");
        AccountDto accountDto = accountService.withdraw(id, amount);
        return ResponseEntity.ok(accountDto);
    }
    // Get All Accounts REST API
    @GetMapping("/all")
    public ResponseEntity<List<AccountDto>> getAllAccounts(){
        List<AccountDto> accounts = accountService.getAllAccounts();
        return ResponseEntity.ok(accounts);
    }

    //Delete Account REST API
    @DeleteMapping("/delete/{id}")
//    @PreAuthorize("hasRole('admin')")
    public ResponseEntity<String> deleteAccount(@PathVariable long id){
        accountService.deleteAccount(id);
        return ResponseEntity.ok("Account deleted successfully!");
    }

    //status: 500
    @DeleteMapping("/delete")
//    @PreAuthorize("hasRole('admin')")
    public ResponseEntity<String> deleteAllAccount(){
        accountService.deleteAllAccounts();
        return ResponseEntity.ok("All Accounts deleted successfully!");
    }


}
