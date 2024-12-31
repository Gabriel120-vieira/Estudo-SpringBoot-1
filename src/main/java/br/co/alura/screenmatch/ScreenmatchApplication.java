package br.co.alura.screenmatch;

import br.co.alura.screenmatch.Service.ConsumoAPI;
import br.co.alura.screenmatch.Service.ConverteDados;
import br.co.alura.screenmatch.models.DadosSerie;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoAPI = new ConsumoAPI();
		String nome ="gilmore girls&Season=1";
		var json= consumoAPI.obterDados("https://www.omdbapi.com/?t="+nome.replace(" ","+")+"&apikey=dbfab68c");
		System.out.println(json);
		ConverteDados conversor = new ConverteDados();
		DadosSerie dados = conversor.obterdados(json, DadosSerie.class);
		System.out.println(dados);
	}
}
