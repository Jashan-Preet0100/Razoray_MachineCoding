package org.example.models;

public class Loan {
    //String admin_username;
    int id;
    String customer_username;
    Long principle_amount;
    double interest_rate;
    int tenure_yearly;
    double payment_emi;
    Boolean isPaymentDone;

    public Loan() {
    }

    public Boolean getPaymentDone() {
        return isPaymentDone;
    }

    public void setPaymentDone(Boolean paymentDone) {
        isPaymentDone = paymentDone;
    }

    public double getPayment_emi() {
        return payment_emi;
    }

    public void setPayment_emi(double payment_emi) {
        this.payment_emi = payment_emi;
    }

    public int getTenure_yearly() {
        return tenure_yearly;
    }

    public void setTenure_yearly(int tenure_yearly) {
        this.tenure_yearly = tenure_yearly;
    }

    public double getInterest_rate() {
        return interest_rate;
    }

    public void setInterest_rate(double interest_rate) {
        this.interest_rate = interest_rate;
    }

    public Long getPrinciple_amount() {
        return principle_amount;
    }

    public void setPrinciple_amount(Long principle_amount) {
        this.principle_amount = principle_amount;
    }

    public String getCustomer_username() {
        return customer_username;
    }

    public void setCustomer_username(String customer_username) {
        this.customer_username = customer_username;
    }

    /*
    public String getAdmin_username() {
        return admin_username;
    }

    public void setAdmin_username(String admin_username) {
        this.admin_username = admin_username;
    }

     */
}
