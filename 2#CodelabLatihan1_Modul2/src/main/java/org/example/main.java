package org.example;

public class main {
        public static void main(String[] args) {
            Product prod = new Product("Smarpthone", 699.99, 50 );
            inventory inv = new inventory(prod, "WareHouse A");

            inv.showInfentory();
            prod.applayStockAdjustment(10);
            inv.showInfentory();
        }
}
