package entities;

import java.util.ArrayList;
import java.util.Date;

public class Paciente extends User {
	
	private ArrayList<FichaAtendimento> historico = new ArrayList<>();
	
	public Paciente(Long id, Long cpf, Date nascimento, String nome ) {
		super(id, cpf, nascimento, nome);
	}
	
	public Paciente() {
		
	}
	
	public void adicionarHistorico(FichaAtendimento ficha) {
		historico.add(ficha);
	}

	public ArrayList<FichaAtendimento> consultarHistorico() {
		return historico;
	}

	public void setHistorico(ArrayList<FichaAtendimento> historico) {
		this.historico = historico;
	}

}
