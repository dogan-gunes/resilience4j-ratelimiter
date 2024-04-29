package com.dgn.ratelimiterdemo.repository;

import com.dgn.ratelimiterdemo.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Long> {
}
