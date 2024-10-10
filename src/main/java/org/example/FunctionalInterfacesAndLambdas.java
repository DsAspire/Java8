package org.example;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfacesAndLambdas {
    public static void main(String[] args) {

        //FUNCTION
        // funkcja przyjmuje String i zwraca String
        Function<String, String> func = text -> text.toLowerCase().trim();
        String original = "   WIELKI NAPIS   ";
        // wywołujemy funkcję przekazując jej original jako argument
        String lowerCaseTrim = func.apply(original);
        System.out.println(lowerCaseTrim);

        //PREDICATE
        int personAge = 19;
        Predicate<Integer> checkIfAdult = age -> age >= 18;
        if (checkIfAdult.test(personAge)) {
            //jakieś operacje
        }

        //CONSUMER
        Consumer<String> print3Times = s -> {
            System.out.println(s);
            System.out.println(s);
            System.out.println(s);
        };

        print3Times.accept("abc");
        print3Times.accept("xxx");

        //SUPPLIER
        Supplier<String> stringSupplier = () -> "Hello, World!";
        System.out.println("String: " + stringSupplier.get());
    }
}
