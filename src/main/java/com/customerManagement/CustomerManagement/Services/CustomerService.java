package com.customerManagement.CustomerManagement.Services;

import com.customerManagement.CustomerManagement.Entities.Customer;
import com.customerManagement.CustomerManagement.Exceptions.CustomerNotFoundException;
import com.customerManagement.CustomerManagement.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class CustomerService {

    @Autowired
    public CustomerRepository customerRepository;

    public List<Customer> getCustomers(){
        return customerRepository.findAll();
    }

    public Customer getCustomersById(Long id){
        return customerRepository.findById(id).orElseThrow(()->new CustomerNotFoundException("The Required Customer Not Found"));
    }

    public Customer addCustomer(Customer customer){
        return customerRepository.save(customer);
    }

    public void deleteCustomer(Long id){
        customerRepository.deleteById(id);
    }

}
