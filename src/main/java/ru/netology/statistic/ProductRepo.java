package ru.netology.statistic;

public class ProductRepo {
    private Product[] products = new Product[0];

    public void save(Product product) {
        Product[] tmp = new Product[products.length + 1];
        for (int i = 0; i < products.length; i++) {
            tmp[i] = products[i];
        }
        tmp[tmp.length - 1] = product;
        products = tmp;
    }

    public Product[] findAll() {
        return products;
    }

    public void removeById(int id) {
        int finLength = 0;
        for (Product product : products) {
            if (product.getId() != id) {
                finLength++;
            }
        }
        Product[] tmp = new Product[finLength];
        int copyToIndex = 0;
        for (Product poster : products) {
            if (poster.getId() != id) {
                tmp[copyToIndex] = poster;
                copyToIndex++;
            }
        }
        products = tmp;
    }
}

