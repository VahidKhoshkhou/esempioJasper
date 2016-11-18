package it.alfasoft.vahid.dao;

import java.util.ArrayList;
import java.util.List;

import it.alfasoft.vahid.dto.Cliente;

public class ClienteDao {
	
	private List<Cliente> listaClienti=new ArrayList<>();
	
	// costruttore
	public ClienteDao(){
		
		
		Cliente c1=new Cliente("Martina","De Martini");
		
		Cliente c2=new Cliente("vahid","Khoshkhou");

		Cliente c3=new Cliente("Fabrizio","Fischetto");
		
		Cliente c4=new Cliente("Grazia","Digiglio");
		
		
		listaClienti.add(c1);
		listaClienti.add(c2);
		listaClienti.add(c3);
		listaClienti.add(c4);
		
	}

	public List<Cliente> getListaClienti() {
		return listaClienti;
	}

	public void setListaClienti(List<Cliente> listaClienti) {
		this.listaClienti = listaClienti;
	}
	
	
	

}
