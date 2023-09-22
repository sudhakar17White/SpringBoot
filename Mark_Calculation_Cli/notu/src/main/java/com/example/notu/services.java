package com.example.notu;

import java.util.HashMap;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class services {
    @Autowired
    private pass_fail ps;

    Scanner s = new Scanner(System.in);
    HashMap<Integer, Integer> hs = new HashMap<>();
    int total = 0;

    public void Banner() {
        System.out.println("_______Mark calculation_____");
    }

    public int Getmark(int size) {
        for (int i = 0; i < size; i++) {
            hs.put(i, s.nextInt());
        }
        for (int i = 0; i < size; i++) {
            total = total + hs.get(i);
        }
        return total;
    }

    public void Disp() {
        System.out.println("Final Mark List");
        for (int i = 0; i < hs.size(); i++) {
            System.out.println((i + 1) + " : " + hs.get(i));
        }
        System.out.println("Total :" + total);
    }

    public void psfa(int size) {
        ps.pasfa(total, size);
    }
}
