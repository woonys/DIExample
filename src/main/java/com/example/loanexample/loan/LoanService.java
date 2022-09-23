package com.example.loanexample.loan;

import com.example.loanexample.interest.Interest;

public interface LoanService {

    Loan getLoanByLoanId(Long loanId);
    int getLoanAmount(Long loanId);

    int getInterestAmount(Loan loan, Interest interest);
}
