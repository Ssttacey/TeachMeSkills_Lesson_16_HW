package com.teachmeskills.lesson16.Fabric;

import com.teachmeskills.lesson16.model.Client;
import com.teachmeskills.lesson16.constant.Constant;

import java.util.HashMap;
import java.util.Map;

public class ClientCreation {

    public static Map<String, Client> createClientOrder() {
        Client cl1 = new Client("10.03.2020", "Mischa", 27, OrderCreation.firstOrder());
        Client cl2 = new Client("23.11.2023", "Masha", 23, OrderCreation.secondOrder());
        Client cl3 = new Client("05.02.2019", "Ivan", 25, OrderCreation.thirdOrder());

        Map<String, Client> clients = new HashMap<>();
        clients.put(Constant.PASS_NUMBER_FIRST_CLIENT, cl1);
        clients.put(Constant.PASS_NUMBER_SECOND_CLIENT, cl2);
        clients.put(Constant.PASS_NUMBER_THIRD_CLIENT, cl3);
        return clients;
    }
}
