


public abstract class funcionario {
	 
	  private String nome;
	  private String sobrenome;
	  private int idade;
	  private String cpf;
	  
	  public funcionario (String nome,String sobrenome, int idade, String cpf){
		  setNome(nome);
		  setSobrenome(sobrenome);
		  setIdade(idade);
		  setCpf(cpf);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	
	  
}
