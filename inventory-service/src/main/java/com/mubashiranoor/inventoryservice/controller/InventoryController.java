package com.mubashiranoor.inventoryservice.controller;

import com.mubashiranoor.inventoryservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/inventory")
@Slf4j
public class InventoryController {

    private final InventoryService inventoryService;


    @GetMapping("/{sku-code}")
    @ResponseStatus(HttpStatus.OK)
    public boolean checkInventory(@PathVariable("sku-code") String skuCode){
        return inventoryService.checkInventory(skuCode);

    }

}
