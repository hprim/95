package org.example.Controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {

@GetMapping("/name")
public String getName() {
	return "Tu Nombre Aquí";
}
}
