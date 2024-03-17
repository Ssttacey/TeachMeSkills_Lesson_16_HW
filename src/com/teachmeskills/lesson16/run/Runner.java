package com.teachmeskills.lesson16.run;

import com.teachmeskills.lesson16.service.Service;

public class Runner {
    public static void main(String[] args) {
        Service.showInfoForEach();
        System.out.println("--------");
        Service.showInfoIterator();
        System.out.println("---------");
        Service.showInfoKeys();
        System.out.println("----------");
        Service.showInfoValues();
    }
}
