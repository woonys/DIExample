package com.example.loanexample.loan;

public interface InterestRule {
    int calculate(int loanAmount);

    InterestRule get(String category);
}
