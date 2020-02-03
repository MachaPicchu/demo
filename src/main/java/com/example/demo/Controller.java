package com.example.demo;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller  {

	@PostMapping("/sorgu")
	public ResponseEntity<?> getDogrulama(@RequestBody @Valid CAdESRequest entity) {

		try {
			return ResponseEntity.ok(entity);
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}

	}

}
