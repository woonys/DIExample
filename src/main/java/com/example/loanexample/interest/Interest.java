package com.example.loanexample.interest;

import com.example.loanexample.loan.Loan;

public interface Interest {
    int getInterestAmount(int loanAmount);

    boolean isDiscount(Loan loan);
}
