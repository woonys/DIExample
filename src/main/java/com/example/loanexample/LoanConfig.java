package com.example.loanexample;

import com.example.loanexample.interest.CashLoanInterest;
import com.example.loanexample.interest.Interest;

import com.example.loanexample.loan.LoanRepository;
import com.example.loanexample.loan.LoanRepositoryImpl;
import com.example.loanexample.loan.LoanService;
import com.example.loanexample.loan.LoanServiceImpl;

public class LoanConfig {
    public Interest interest() {
        return new CashLoanInterest();
    }

    public LoanRepository loanRepository() {
        return new LoanRepositoryImpl();
    }
    public LoanService loanService() {
        return new LoanServiceImpl(
            new LoanRepositoryImpl(),
            new CashLoanInterest()
        );
    }
}
