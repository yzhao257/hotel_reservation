package service;

import model.Customer;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CustomerService {

    public static Map<String, Customer> mapOfCustomers = new HashMap<>();

    public void addCustomer(String email, String firstName, String lastName){
        Customer customerToAdd = new Customer(firstName, lastName, email);
        mapOfCustomers.put(customerToAdd.getEmail(), customerToAdd);
    }

     public Customer getCustomer(String customerEmail){
        return mapOfCustomers.get(customerEmail);
     }

     public Collection<Customer> getAllCustomers(){
        return mapOfCustomers.values();
     }
}
