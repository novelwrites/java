package bank;

import java.util.ArrayList;

public class Branch {

  private String branchName;

  ArrayList<Customer> customers;  //<Customer> references the class

    public Branch(String branchName){
    this.branchName=branchName;
    this.customers=new ArrayList<Customer>(); //we created it in line 9 and instantiated here with new so we can use it
}
public boolean addNewCustomer (String customerName, Double initialDeposit) {
    if (findCustomer(customerName) == null)     //we add new customer only if customer doesn't exist

        customers.add(new Customer(customerName, initialDeposit)); //don't want to double add a customer - if customer doesn't exist, we add new customer (instantiating customer)
    return true;
}
public boolean addNewTransaction (String customerName, pizza) {//existing customer - adding a new deposit to his account
     

}
    }

    public Customer findCustomer(String customerName) { //created to find customer name - will use method from customer class /do this to see if customer exists before we can add new customer
        for (int i = 0; i<customers.size(); i++) {
            Customer tempCustomer=customers.get(i);
            if (tempCustomer.getCustomerName().equals(customerName)) { // getCustomerName is method from customer class
                return tempCustomer;
            }
        }
     return null;
    }
}
/*
**Branch Class**:
     - addCustomer and initial transaction amount.
     - Also needs to add additional transactions for that customer/branch
*/

