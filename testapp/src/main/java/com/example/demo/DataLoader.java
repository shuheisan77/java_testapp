package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class DataLoader {
	
	@Bean
    CommandLineRunner initDatabase(ItemRepository repository) {
        return args -> {
            repository.save(new Item("Item1"));
            repository.save(new Item("Item2"));
            repository.save(new Item("Item3"));
        };
    }

}
