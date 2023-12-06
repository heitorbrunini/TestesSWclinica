package application;

import java.util.ArrayList;

import entities.Atendente;
import entities.Dentista;
import entities.FichaAtendimento;
import entities.Paciente;
import entities.Pagamento;

public class Sistema {

	private ArrayList<FichaAtendimento> fichasChamadas = new ArrayList<>();
	private ArrayList<Paciente> pacientes = new ArrayList<>();
	private ArrayList<Dentista> dentistas = new ArrayList<>();
	private ArrayList<Atendente> atendentes = new ArrayList<>();
	private ArrayList<Pagamento> pagamentos = new ArrayList<>();

	public Sistema() {

	}

	public FichaAtendimento chamarProximo() {
		return fichasChamadas.get(0);
	};

	public void concluirAtendimento() {
		Pagamento p = new Pagamento(fichasChamadas.get(0));
		pagamentos.add(p);
		fichasChamadas.get(0).setAtendido(true);
		fichasChamadas.remove(0);
	}

	public String pagar(String tipo) {
		String texto = pagamentos.get(0).realizarPagamento(tipo);
		pagamentos.remove(0);
		return texto;
	}

	public boolean verificarCadastroDentistas(Long id) {

		for (Dentista dentista : dentistas) {
			if (dentista.getId().compareTo(id) == 0) {
				return true;
			}
		}

		return false;
	}
	
	public boolean verificarCadastroAtendentes(Long id) {

		for (Atendente atendente : atendentes) {
			if (atendente.getId().compareTo(id) == 0) {
				return true;
			}
		}

		return false;
	}
	
	public boolean verificarCadastro(Long cpf) {

		for (Paciente paciente : pacientes) {
			if (paciente.getCpf() == cpf) {
				return true;
			}
		}

		return false;
	}


	public ArrayList<FichaAtendimento> getFichasChamadas() {
		return fichasChamadas;
	}

	public void addFichasChamadas(FichaAtendimento fichasChamada) {
		this.fichasChamadas.add(fichasChamada);
	}

	public ArrayList<Paciente> getPacientes() {
		return pacientes;
	}

	public void addPacientes(Paciente paciente) {
		this.pacientes.add(paciente);
	}

	public ArrayList<Dentista> getDentistas() {
		return dentistas;
	}

	public void addDentistas(Dentista dentista) {
		this.dentistas.add(dentista);
	}

	public ArrayList<Atendente> getAtendentes() {
		return atendentes;
	}

	public void addAtendentes(Atendente atendente) {
		this.atendentes.add(atendente);
	}

	public ArrayList<Pagamento> getPagamentos() {
		return pagamentos;
	}

	public void addPagamentos(Pagamento pagamento) {
		this.pagamentos.add(pagamento);
	}

	public void removeAtendente(Long id) {

        for (Atendente atendente : atendentes) {
            if (atendente.getId().compareTo(id) == 0) {
                atendentes.remove(atendente);
            }
        }

    }
	public void removeDentista(Long id) {

		for (Dentista dentista : dentistas) {
			if (dentista.getId().compareTo(id) == 0) {
				atendentes.remove(dentista);
			}
		}
	}
	
	

}
