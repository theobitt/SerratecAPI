package br.com.residencia.calculadora;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculadora {
	@RequestMapping("/soma")
	public double soma(@RequestParam double valor1, @RequestParam double valor2) {
		return valor1 + valor2;
	}

	@RequestMapping("/subtracao")
	public double subtracao(@RequestParam double valor1, @RequestParam double valor2) {
		return valor1 - valor2;
	}

	@RequestMapping("/multiplicacao")
	public double multiplicacao(@RequestParam double valor1, @RequestParam double valor2) {
		return valor1 * valor2;
	}

	@RequestMapping("/divisao")
	public double divisao(@RequestParam double valor1, @RequestParam double valor2) {
		if (valor1 == 0) {
			return 0;
		}
		return valor1 / valor2;
	}
	@RequestMapping("/todos")
	public String todosCalculos(@RequestParam double valor1, @RequestParam double valor2) {
		if (valor1 == 0){
			return "Soma = "+(valor1+valor2)+"\nSubtracao = "+(valor1-valor2)+
					"Multiplicacao = "+(valor1*valor2)+"\nDivisao = Divisao por 0 invalida";
		}
		return "Soma = "+(valor1+valor2)+"\nSubtracao = "+(valor1-valor2)+
				"Multiplicacao = "+(valor1*valor2)+"divisao = "+(valor1/valor2);
	}
}
