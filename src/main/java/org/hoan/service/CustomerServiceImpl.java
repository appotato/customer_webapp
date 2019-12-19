package org.hoan.service;

import org.hoan.dao.CustomerDAO;
import org.hoan.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDAO customerDAO;

    @Transactional
    public List<Customer> getCustomers(){
        return customerDAO.getCustomers();
    }

    @Transactional
    public void saveCustomer(Customer customer){
        customerDAO.saveCustomer(customer);
    }

    @Transactional
    public Customer getCustomer(int id){
        return customerDAO.getCustomer(id);
    }

    @Transactional
    public void deleteCustomer(int id){
        customerDAO.deleteCustomer(id);
    }
}
