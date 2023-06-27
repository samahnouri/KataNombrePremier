package com.perso.repo;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberService {

    public List<Integer> calculate(int x) {
        boolean isPrimary=true;
        List<Integer> result=new ArrayList<>();
        for (int i = 2; i < x; i++) {
            for(int j=2;j<=i-1;j++){
                if((i % j)!=0){
                    isPrimary=false;
                }
                if(isPrimary)
                result.add(i);
            }

        }
        return result;
    }
}
