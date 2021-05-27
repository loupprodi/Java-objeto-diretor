
public class MainEmpresa {

	public static void main(String[] args) {
		
		cargo cargo = new cargo ("1","Projetista",4000);
		
		trabalho trabalho = new trabalho ("Construção de ponte","32",9);
		
		diretor diretor = new diretor ("Vitor","Nunes",25,"123456789","21","Financeiro",cargo,trabalho);
		System.out.println(diretor);
				
	}

}
