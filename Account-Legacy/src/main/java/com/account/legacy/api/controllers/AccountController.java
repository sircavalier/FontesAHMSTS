package com.account.legacy.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.account.legacy.api.documents.*;
import com.account.legacy.api.responses.Response;
import com.account.legacy.api.services.AccountService;

import java.io.*;
import java.util.List;	

@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping(path = "api/v1/account")
public class AccountController {
   
	@Autowired
	private AccountService accountService;
	
	@CrossOrigin(origins = "http://localhost:8080")
	@RequestMapping("/summary")
	@GetMapping
    public ResponseEntity<Response<List<Summary>>> summary() throws IOException {
		return ResponseEntity.ok(new Response<List<Summary>>(this.accountService.getAll()));
    }
}