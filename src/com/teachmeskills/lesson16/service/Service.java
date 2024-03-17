package com.teachmeskills.lesson16.service;

import com.teachmeskills.lesson16.Fabric.ClientCreation;
import com.teachmeskills.lesson16.model.Client;

import java.util.Iterator;
import java.util.Map;

public class Service {

    public static void showInfoForEach() {
        Map<String, Client> clients = ClientCreation.createClientOrder();
        for (Map.Entry<String, Client> element : clients.entrySet()) {
            System.out.println("\nKey = " + element.getKey() + " -> Value: " + element.getValue().toString());
        }
    }

    public static void showInfoIterator() {
        Map<String, Client> clients = ClientCreation.createClientOrder();
        Iterator<Map.Entry<String, Client>> iterator = clients.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Client> entry = iterator.next();
            System.out.println("\nKey = " + entry.getKey() + " -> Value: " + entry.getValue().toString());
        }
    }

    public static void showInfoKeys() {
        Map<String, Client> clients = ClientCreation.createClientOrder();
        System.out.println("\nKeys = " + clients.keySet());
    }

    public static void showInfoValues() {
        Map<String, Client> clients = ClientCreation.createClientOrder();
        System.out.println("\nValues: " + clients.values());
    }
}
