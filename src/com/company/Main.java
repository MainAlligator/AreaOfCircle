package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите радиус круга: ");
        double radius = sc.nextDouble();
        double area = (radius * radius) * Math.PI;
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Площадь круга: " + area);
        System.out.println("Периметр  круга: " + perimeter);
    }
}
