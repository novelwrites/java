package bank;

import java.util.ArrayList;

public class Customer { //class is blueprint to create the object - each class has a constructor

    private String customerName; //declaring it as private - encapsulation
    ArrayList<Double> transactions; //Double is a data type that works well because of decimal places which is good for money

    public Customer(String customerName, Double pizza){  //Constructor for the class - that's how we create objects - we are creating Customer; each new account needs a new transaction
        //everytime we call the constructor we are instantiating the customername and transaction for each new customer; each customer needs name and initial deposit (pizza)
        this.customerName=customerName;
        this.transactions=new ArrayList<Double>();
        addTransaction(pizza); //Adding initial deposit to transaction list but also available for future transactions
    }

    public String getCustomerName(){     //public to access method
        return this.customerName;
    }
    public void addTransaction(Double depositAmt){ //adding new transaction
        transactions.add(depositAmt);
    }

    public ArrayList<Double> getTransactions() { //See line 8 - we are returning transactions
        return this.transactions
    }

}

/*
- **Customer Class**:
- Customer Name
*/

