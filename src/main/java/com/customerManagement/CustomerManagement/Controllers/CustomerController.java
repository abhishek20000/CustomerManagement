package com.customerManagement.CustomerManagement.Controllers;


import com.customerManagement.CustomerManagement.Entities.Customer;
import com.customerManagement.CustomerManagement.Services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    CustomerService customerService= new CustomerService();

    @GetMapping
    public ResponseEntity<List<Customer>> getCustomers(){
        List<Customer> allCustomers=customerService.getCustomers();
        return new ResponseEntity<>(allCustomers, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> getCustomer(@PathVariable("id") Long id){
        Customer customer= customerService.getCustomersById(id);
        return new ResponseEntity<>(customer,HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer){
        Customer newCustomer= customerService.addCustomer(customer);
        return new ResponseEntity<>(newCustomer,HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer){
        Customer newCustomer= customerService.addCustomer(customer);
        return new ResponseEntity<>(newCustomer,HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable("id") Long id){
        customerService.deleteCustomer(id);
    }





}
