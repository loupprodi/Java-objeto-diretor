
		public class trabalho implements bonus  {
	  
	  private String projeto;
	  private String cod_empresa;
	  private int horaTrabalho;
	  
	  public trabalho (String projeto,String cod_empresa, int horaTrabalho){
		  setProjeto(projeto);
		  setCod_empresa(cod_empresa);
		  setHoraTrabalho(horaTrabalho);
	  }

	public String getProjeto() {
		return projeto;
	}

	public void setProjeto(String projeto) {
		this.projeto = projeto;
	}

	public String getCod_empresa() {
		return cod_empresa;
	}

	public void setCod_empresa(String cod_empresa) {
		this.cod_empresa = cod_empresa;
	}

	public int getHoraTrabalho() {
		return horaTrabalho;
	}

	public void setHoraTrabalho(int horaTrabalho) {
		this.horaTrabalho = horaTrabalho;
	}

	
	public double getBonus() {
		
		return (horaTrabalho * 65);
	}
	public String toString() {
		return String.format("%nTrabalha no Projeto %s, durante %d meses %n"
				+ "o Bonus desse projeto foi de R$ %.2f ",getProjeto(),getHoraTrabalho(),getBonus());
	}	
	
}
