package com.example.loanexample.interest;

import com.example.loanexample.loan.Loan;

public class LevelUpLoanInterest implements Interest{
    private int levelUpLoanInterest = 20;

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
        return loanAmount * (levelUpLoanInterest/100);
    }
}
