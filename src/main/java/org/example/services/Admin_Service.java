package org.example.services;

import org.example.models.Loan;
import org.example.models.User;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Admin_Service {

    Map<Integer, Loan> loanMap = new HashMap<>();
    List<Loan> existingLoans = new ArrayList<>();

    public boolean createLoan(int id){
        if(loanMap.containsKey(id)){
            System.out.println("Loan Exist already");
            return false;
        }
        loanMap.put(id,new Loan());
        return true;
    }

    public List<Loan> getAllLoans(Loan loan){
        List<Loan> loanList = new ArrayList<>();
        for (Loan loan1 : existingLoans){
            loanList.add(loan1);
        }
        return loanList;
    }

}
