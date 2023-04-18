package com.notu.notuing;

import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class dependecy_injection {
    
    void print()
    {
        Scanner s=new Scanner(System.in);
        String name=s.nextLine();
        System.out.println("Dependecy Injection study With "+name);

    }

}
