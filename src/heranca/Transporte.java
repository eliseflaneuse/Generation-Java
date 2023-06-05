package heranca;

public class Transporte {
	
	private int capacidade;
	
	public Transporte (int capacidade) {
		this.capacidade = capacidade;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	
	public void visualizar() {
		System.out.println("Saudações. A nossa capacidade é: " + this.capacidade);
	}
}
