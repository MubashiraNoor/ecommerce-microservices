package com.mubashiranoor.inventoryservice;

import com.mubashiranoor.inventoryservice.model.Inventory;
import com.mubashiranoor.inventoryservice.repository.InventoryRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }


    @Bean
    public CommandLineRunner loadInventoryData(InventoryRepo inventoryRepo) {



        return args -> {
            Inventory inventory = new Inventory();
            inventory.setSkuCode("jkl");
            inventory.setQuantity(4);
            inventoryRepo.save(inventory);

            Inventory inventory1 = new Inventory();
            inventory1.setSkuCode("mno");
            inventory1.setQuantity(5);
            inventoryRepo.save(inventory1);
        };
    };

}
