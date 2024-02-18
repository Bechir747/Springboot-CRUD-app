package com.example.banking.repository;

import com.example.banking.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// A repository in Spring Boot is a higher-level abstraction that simplifies database interactions by providing pre-defined methods for common CRUD operations.
@Repository
public interface AccountRepository extends JpaRepository<Account,Long>{
}
