package com.tt.multi_db.service;

import com.tt.multi_db.entity.mysql.User;
import com.tt.multi_db.entity.postgres.Product;
import com.tt.multi_db.repository.mysql.UserRepository;
import com.tt.multi_db.repository.postgres.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserProductService {
    private final UserRepository userRepository;
    private final ProductRepository productRepository;

    public UserProductService(UserRepository userRepository, ProductRepository productRepository) {
        this.userRepository = userRepository;
        this.productRepository = productRepository;
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }// Add methods to interact with both repositories as needed

}
