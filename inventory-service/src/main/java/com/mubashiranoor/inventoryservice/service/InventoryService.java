package com.mubashiranoor.inventoryservice.service;

import com.mubashiranoor.inventoryservice.repository.InventoryRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class InventoryService {

    private final InventoryRepo inventoryRepo;
    public boolean checkInventory(String skuCode) {
     return inventoryRepo.findBySkuCode(skuCode).isPresent();
    }
}
