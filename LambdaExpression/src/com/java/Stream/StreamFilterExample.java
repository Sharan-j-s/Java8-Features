package com.java.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample {
    public static void main(String[] args) {

        // Using traditional programming to filter out objects from the list
        List<Product> list = new ArrayList<Product>();

        for (Product product : getProducts())
        {
            if (product.getPrice() > 25000f)
                list.add(product);
        }

        for (Product product : list)
            System.out.println(product);

        System.out.println("------------------------------------------------------");

        // Using Stream API
       /* List<Product> list2 = getProducts().stream().filter((product -> product.getPrice() > 25000f)).collect(Collectors.toList());
       list2.forEach(System.out::println); */

        // In one line we can write it like below

        getProducts().stream().filter((product -> product.getPrice() > 25000f)).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("-----------------------------------------------------------");

        getProducts().stream().filter(product -> product.getName().startsWith("A")).collect(Collectors.toList()).forEach(System.out::println);

    }

    private static List<Product> getProducts(){

        List<Product> productList = new ArrayList<Product>();
        productList.add(new Product(1, "HP Laptop", 25000f));
        productList.add(new Product(2, "Dell Laptop", 28000f));
        productList.add(new Product(3, "Lenovo Laptop", 29000f));
        productList.add(new Product(4, "Sony Laptop", 35000f));
        productList.add(new Product(5, "Apple Laptop", 45000f));
        return productList;

    }
}

class Product{
    private int id;
    private String name;
    private float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
