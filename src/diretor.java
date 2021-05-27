
public class diretor extends funcionario {
	
	public diretor(String nome, String sobrenome, int idade, String cpf, String id_diretor, String setor, cargo cargo,trabalho trabalho) {
		super(nome, sobrenome, idade, cpf);
		  setId_diretor(id_diretor);
		  setSetor(setor);
		  setCargo(cargo);
		  setTrabalho(trabalho);
	}
	private String id_diretor;
	private String setor;
	private cargo cargo;
	private trabalho trabalho;
	
	public String getId_diretor() {
		return id_diretor;
	}
	public void setId_diretor(String id_diretor) {
		this.id_diretor = id_diretor;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public cargo getCargo() {
		return cargo;
	}
	public void setCargo(cargo cargo) {
		this.cargo = cargo;
	}
	public trabalho getTrabalho() {
		return trabalho;
	}
	public void setTrabalho(trabalho trabalho) {
		this.trabalho = trabalho;
	}
	public String toString() {
		return String.format("O %s %s diretor da empresa tem %d anos, portador do %s, gerencia o %s %n"
				+ "empenha o %s %s ", getNome(),getSobrenome(),getIdade(),getCpf(),getSetor(),getCargo(),getTrabalho());
	}
	
	
		
		
}
