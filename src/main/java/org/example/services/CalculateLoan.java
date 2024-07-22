package org.example.services;

import org.example.models.Loan;
import org.example.models.User;

public class CalculateLoan {
   Loan loan;

    public CalculateLoan(Loan loan) {
        this.loan = loan;
    }

    public double calculatePayments(){
        double i = (loan.getPrinciple_amount()* loan.getTenure_yearly()* loan.getInterest_rate())/100;
        double a = loan.getPrinciple_amount()+i;
        double payment = a/(loan.getTenure_yearly()*12);
        return payment;
    }
}
