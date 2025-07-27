package com.example.Book_Management_System.utils;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class DevStartupRunner {
    @PostConstruct
    public void init() {
        System.out.println("🚀 Dev profile loaded...");
    }
}
