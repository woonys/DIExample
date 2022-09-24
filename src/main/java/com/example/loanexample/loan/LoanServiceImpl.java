package com.example.loanexample.loan;

import java.util.Map;

import com.example.loanexample.interest.Interest;

public class LoanServiceImpl implements LoanService {

    private LoanRepository loanRepository;
    private Interest interest;
    private Map<String, InterestRule> interestRuleMap;

    public LoanServiceImpl(LoanRepositoryImpl loanRepository, Interest interest) {
        this.loanRepository = loanRepository;
        this.interest = interest;
        this.interestRuleMap = interestRuleMap;
    }

    @Override
    public Loan getLoanByLoanId(Long loanId) {
        Loan loan = loanRepository.findById(loanId);
        return loan;
    }

    @Override
    public int getLoanAmount(Long loanId) {
        Loan loan = loanRepository.findById(loanId);
        int loanAmount = loan.getLoanAmount();
        return loanAmount;
    }

    @Override
    public int getInterestAmount(Loan loan, Interest interest) {
        return interest.getInterestAmount(loan.getLoanAmount());
    }

    public int getNealInterestAmount(Loan loan) {
        InterestRule interestRule = interestRuleMap.get("CL");
        return loan.calculateInterest(interestRule);
    }
}
