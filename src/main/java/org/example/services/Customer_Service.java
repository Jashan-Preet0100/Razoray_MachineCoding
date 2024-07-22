package org.example.services;

import org.example.models.Loan;
import org.example.models.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Customer_Service {

    User user;

    public Customer_Service(User user) {
        this.user = user;
    }

    Map<String,Loan> paymentMap = new HashMap<>();
    List<Loan> existingLoans = new ArrayList<>();

    public boolean makePayment(String name){
        if (!(paymentMap.containsKey(name))){
            System.out.println("Loan doesn't exist payment cant be done");
            return false;
        }
        System.out.println("payment done");
        return true;
    }

    public List<Loan> getCustomerLoans(String name){
        List<Loan> loanList = new ArrayList<>();
        for (Loan loan1 : existingLoans){
            loanList.add(loan1);
        }
        return loanList;
    }
}
