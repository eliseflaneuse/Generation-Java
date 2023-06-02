package objetos;

import objetos.Cliente;

public class TestaCliente {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("James Tiberius Kirk", 30, "Federation Starfleet", "Captain", "Commanding officer,\r\n"
				+ "USS Enterprise-A");
        Cliente cliente2 = new Cliente("S'chn T'gai Spock", 25, "Federation Starfleet", "Commander", "\r\n"
        		+ "Executive officer/Science officer,\r\n"
        		+ "USS Enterprise-A");

        cliente1.visualizar();
        System.out.println();
        cliente2.visualizar();

	}

}
