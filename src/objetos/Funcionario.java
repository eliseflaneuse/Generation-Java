package objetos;

public class Funcionario {
	
	// Atributos da Classe Cliente - Os Atributos são responsáveis por identificar
		// as características do Objeto.
		private String position;
	    private String name;
	    private String species;
	    private String affiliation;
	    private String rank;
	    private String occupation;
	    private String serialNumber;

		// Método Construtor da Classe Conta - com todos os parâmetro
		public Funcionario(String position, String name, String species, String affiliation, String rank,
		                String occupation, String serialNumber) {
		  this.position = position;
		  this.name = name;
		  this.species = species;
		  this.affiliation = affiliation;
		  this.rank = rank;
		  this.occupation = occupation;
		  this.serialNumber = serialNumber;
		}

		// Métodos Get e Set da Classe Conta
		public String getPosition() {
	        return position;
	    }

	    public void setPosition(String position) {
	        this.position = position;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getSpecies() {
	        return species;
	    }

	    public void setSpecies(String species) {
	        this.species = species;
	    }

	    public String getAffiliation() {
	        return affiliation;
	    }

	    public void setAffiliation(String affiliation) {
	        this.affiliation = affiliation;
	    }

	    public String getRank() {
	        return rank;
	    }

	    public void setRank(String rank) {
	        this.rank = rank;
	    }

	    public String getOccupation() {
	        return occupation;
	    }

	    public void setOccupation(String occupation) {
	        this.occupation = occupation;
	    }

	    public String getSerialNumber() {
	        return serialNumber;
	    }

	    public void setSerialNumber(String serialNumber) {
	        this.serialNumber = serialNumber;
	    }

	    public void visualizar() {
	        System.out.println("Position: " + position);
	        System.out.println("Name: " + name);
	        System.out.println("Species: " + species);
	        System.out.println("Affiliation: " + affiliation);
	        System.out.println("Rank: " + rank);
	        System.out.println("Occupation: " + occupation);
	        System.out.println("Serial number: " + serialNumber);
	    }
}
