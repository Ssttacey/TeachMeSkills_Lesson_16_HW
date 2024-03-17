package com.teachmeskills.lesson16.fabric;

import com.teachmeskills.lesson16.model.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderCreation {

        public static List<OrderCreation> firstOrder() {
            Order ord1 = new Order("Bacon", 4.67, "Meat product");
            Order ord2 = new Order("Cookies", 3.76, "Bakery products");
            Order ord3 = new Order("Apples", 3.50, "Fruits");

            List<OrderCreation> orderOne = new ArrayList<>();
            orderOne.add(ord1);
            orderOne.add(ord2);
            orderOne.add(ord3);
            return orderOne;
        }

        public static List<OrderCreation> secondOrder() {
            Order ord4 = new Order("1984", 14.65, "Book");
            Order ord5 = new Order("Pencil", 2.55, "office for study");
            Order ord6 = new Order("Markers", 15.0, "Office for drawing");

            List<OrderCreation> secondOrder = new ArrayList<>();
            secondOrder.add(ord4);
            secondOrder.add(ord5);
            secondOrder.add(ord6);
            return secondOrder;
        }

        public static List<OrderCreation> thirdOrder() {
            Order ord7 = new Order("Guitar", 500.0, "Musical instrument");

            List<OrderCreation> thirdOrder = new ArrayList<>();
            thirdOrder.add(ord7);
            return thirdOrder;
        }
    }
