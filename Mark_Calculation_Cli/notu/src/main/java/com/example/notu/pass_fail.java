package com.example.notu;

import org.springframework.stereotype.Component;

@Component
public class pass_fail {
    public void pasfa(int total, int size) {
        if ((total / size) >= 50) {
            System.out.println("pass");
        } else {
            System.out.println("Fail");
        }

    }
}
