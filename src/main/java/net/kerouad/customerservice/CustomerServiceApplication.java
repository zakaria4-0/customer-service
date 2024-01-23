package net.kerouad.customerservice;

import net.kerouad.customerservice.entities.Customer;
import net.kerouad.customerservice.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
        return args -> {
            Customer customer1 = Customer.builder()
                    .firstName("Hassan")
                    .lastName("Elhouni")
                    .email("Hassan@gmail.com")
                    .build();

            Customer customer2 = Customer.builder()
                    .firstName("zakaria")
                    .lastName("kerouad")
                    .email("zakaria@gmail.com")
                    .build();
            customerRepository.saveAll(List.of(customer1,customer2));
        };
    }
}
