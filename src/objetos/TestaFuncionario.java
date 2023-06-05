package objetos;

import objetos.Funcionario;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario commandingOfficer = new Funcionario("Commanding Officer", "James T. Kirk", "Human",
                "Federation Starfleet", "Captain", "Commanding officer, USS Enterprise-A", "SC937-0176CEC");
		Funcionario firstOfficer = new Funcionario("Science Officer", "S'chn T'gai Spock", "Vulcan",
                "Federation Starfleet", "Lieutenant Commander", "Science officer", "N/A");
        Funcionario chiefEngineer = new Funcionario("Chief Engineer", "Montgomery Scott", "Human",
                "Federation Starfleet", "Lieutenant Commander", "Chief engineer", "N/A");
        Funcionario chiefMedicalOfficer = new Funcionario("Chief Medical Officer", "Leonard McCoy", "Human",
                "Federation Starfleet", "Commander", "Chief medical officer", "N/A");
        Funcionario helmsman = new Funcionario("Helmsman", "Hikaru Sulu", "Human", "Federation Starfleet",
                "Lieutenant", "Helmsman", "N/A");
        Funcionario navigator = new Funcionario("Navigator", "Pavel Chekov", "Human", "Federation Starfleet",
                "Ensign", "Navigator", "N/A");
        Funcionario communicationsOfficer = new Funcionario("Communications Officer", "Nyota Uhura", "Human",
                "Federation Starfleet", "Lieutenant", "Communications officer", "N/A");
        

        commandingOfficer.visualizar();
        System.out.println();
        firstOfficer.visualizar();
        System.out.println();
        chiefEngineer.visualizar();
        System.out.println();
        chiefMedicalOfficer.visualizar();
        System.out.println();
        helmsman.visualizar();
        System.out.println();
        navigator.visualizar();
        System.out.println();
        communicationsOfficer.visualizar();
        

	}

}
