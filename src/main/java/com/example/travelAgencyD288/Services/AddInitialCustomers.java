package com.example.travelAgencyD288.Services;

import com.example.travelAgencyD288.DAO.CustomerRepository;
import com.example.travelAgencyD288.Entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddInitialCustomers {
    private CustomerRepository customerRepository;

    @Autowired
    public AddInitialCustomers(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    public void initializeCustomers() {
        if (customerRepository.count() > 0) {
            // Customers already exist, skip initialization
            return;
        }
        Customer customer1= new Customer("April", "Adams", "123 Easy Street", "11111", "(123)-456-7890", null, null,null);
        customerRepository.save(customer1);

        Customer customer2= new Customer("June", "Bug", "345 Med Ln", "22222", "(321)-654-7890", null, null,null);
        customerRepository.save(customer2);

        Customer customer3= new Customer("March", "May", "678 Hard Rd", "33333", "(832)-456-3747", null, null,null);
        customerRepository.save(customer3);

        Customer customer4= new Customer("Aiden", "Willis", "910 Excited Court", "44444", "(594)-243-1394", null, null,null);
        customerRepository.save(customer4);

        Customer customer5= new Customer("Paco", "Taco", "324 Mad MNR", "55555", "(713)-838-2945", null, null,null);
        customerRepository.save(customer5);

        System.out.println("Sample customers initialized successfully.");
    }
}
