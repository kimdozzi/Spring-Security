package com.example.springsecuritybasic.config;

//import com.example.springsecuritybasic.customer.domain.Customer;
//import com.example.springsecuritybasic.customer.repository.CustomerRepository;
//import java.util.ArrayList;
//import java.util.List;
//import lombok.RequiredArgsConstructor;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//@RequiredArgsConstructor
//@Service
public class BankUserDetails {
    // implements UserDetailsService

//    private final CustomerRepository customerRepository;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        String userName, password = null;
//        List<GrantedAuthority> authorities = null;
//        List<Customer> customers = customerRepository.findByEmail(username);
//        if(customers.isEmpty()) {
//            throw new UsernameNotFoundException("User details not found for the user : " + username);
//        } else {
//            userName = customers.get(0).getEmail();
//            password = customers.get(0).getPwd();
//            authorities = new ArrayList<>();
//            authorities.add(new SimpleGrantedAuthority(customers.get(0).getRole()));
//        }
//        return new User(userName, password, authorities);
//    }
}
