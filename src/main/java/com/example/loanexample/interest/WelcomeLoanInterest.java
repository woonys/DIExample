package com.example.loanexample.interest;

import com.example.loanexample.loan.Loan;

public class WelcomeLoanInterest implements Interest{
    private int welcomeLoanInterest = 30;

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

        return loanAmount * (welcomeLoanInterest/100);
    }
}
