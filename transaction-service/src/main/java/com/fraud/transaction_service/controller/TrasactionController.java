package com.fraud.transaction_service.controller;


import com.fraud.transaction_service.business.dto.TransactionDTO;
import com.fraud.transaction_service.business.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transactions")
@RequiredArgsConstructor
public class TrasactionController {

    private final TransactionService transactionService;

    @PostMapping
    public ResponseEntity<TransactionDTO> newTransaction(@RequestBody TransactionDTO dto) {
        return ResponseEntity.ok(transactionService.newTransaction(dto));
    }
}
