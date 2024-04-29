package com.dgn.ratelimiterdemo;

import com.dgn.ratelimiterdemo.model.Account;
import com.dgn.ratelimiterdemo.repository.AccountRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RatelimiterDemoApplication implements CommandLineRunner {

	private final AccountRepository accountRepository;

	public RatelimiterDemoApplication(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(RatelimiterDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Account account = new Account("DOĞAN","GÜNEŞ");
		accountRepository.save(account);
	}
}
