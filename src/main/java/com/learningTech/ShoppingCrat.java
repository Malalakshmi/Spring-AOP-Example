package com.learningTech;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCrat {
    public void checkout(String status){
        //the below three are the cross cutting concerns so we should seperate them from bussiness Logic
        //Login --> Aspect
        //Authentication & Authorization -- Aspect
        //santize the data -- Aspect
        System.out.println("checkout method from shopping cart has called"); // bussiness Logic
    }

    public int quantity(){
        return 2;
    }

}
