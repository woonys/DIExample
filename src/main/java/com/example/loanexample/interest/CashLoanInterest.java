package com.example.loanexample.interest;

import com.example.loanexample.loan.Loan;

public class CashLoanInterest implements Interest{
    private int cashLoanInterest = 10;

    @Override
    public boolean isDiscount(Loan loan) {
        if (loan.isVip()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int getInterestAmount(int loanAmount) {
        return loanAmount * (cashLoanInterest/100);
    }
}
