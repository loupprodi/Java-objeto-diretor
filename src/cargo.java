
public class cargo {

	private String id_cargo;
	private String nome_cargo;
	private double salario;
	
	public cargo(String id_cargo, String nome_cargo, double salario) {
		setId_cargo(id_cargo);
		setNome_cargo(nome_cargo);
		setSalario(salario);
	}

	public String getId_cargo() {
		return id_cargo;
	}

	public void setId_cargo(String id_cargo) {
		this.id_cargo = id_cargo;
	}

	public String getNome_cargo() {
		return nome_cargo;
	}

	public void setNome_cargo(String nome_cargo) {
		this.nome_cargo = nome_cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String toString() {
		return String.format("cargo de %s salário é de %.2f \n", getNome_cargo(),getSalario());
	}	
}
