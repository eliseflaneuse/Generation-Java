package objetos;

public class Cliente {
	
	// Atributos da Classe Cliente - Os Atributos são responsáveis por identificar
	// as características do Objeto.
	private String nome;
	private int idade;
	private String affiliation;
	private String rank;
	private String occupation;

	// Método Construtor da Classe Conta - com todos os parâmetro
	public Cliente(String nome, int idade, String affiliation, String rank, String occupation) {
		this.nome = nome;
		this.idade = idade;
		this.affiliation = affiliation;
		this.rank = rank;
		this.occupation = occupation;
	}

	// Métodos Get e Set da Classe Conta
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

	public String getEndereco() {
		return affiliation;
	}

	public void setEndereco(String affiliation) {
		this.affiliation = affiliation;
	}

	public String getTelefone() {
		return rank;
	}

	public void setTelefone(String rank) {
		this.rank = rank;
	}

	public String getEmail() {
		return occupation;
	}

	public void setEmail(String occupation) {
		this.occupation = occupation;
	}

	public void visualizar() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		System.out.println("Affiliation: " + this.affiliation);
		System.out.println("Rank: " + this.rank);
		System.out.println("Occupation: " + this.occupation);
	}
}
