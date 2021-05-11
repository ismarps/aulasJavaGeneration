package tabela1105;
/*
 * Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e
comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as
características de forma que tudo o que for comum a todos os animais fique na classe
Animal
 */
public class Animal {
	//Atributos
	private String nome;
	private int idade;
	//Metodo construtor
	public Animal(String nome, int idade) {
		super(); // Lmebrando que o super() no construtor da superclasse sinaliza que os atributos sao da superclasse
		this.nome = nome;
		this.idade = idade;
	}
	//METODOS getters e setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	//Metodo generalista que todas as subclasses vao possuir
	
	public void emitirSom(String bicho) {
		System.out.println(bicho+" esta emitindo som...");
	}
	
	
	
	
}
