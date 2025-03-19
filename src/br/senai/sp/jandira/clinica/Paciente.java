package br.senai.sp.jandira.clinica;

public class Paciente {
	private String nome;
	public LocalDate birthDate;
	public int weight;
	private double height;
	public String telefone;
	private double imc;
public void setName(String nome) {
		
		if (nome.length() >= 3){
			this.nome = nome.toUpperCase();
		}
		else {			
			System.out.println("O nome " + nome + " deve conter pelo menos 3 caracteres");
		}
		
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setHeight(double height) {
		if (height <= 0) {
			//Numero invalido
			System.out.println("Altura "+ height + " do(a) paciente"+ nome + " inválida \nO programa não aceita valores menores que 0.");
		}
		else if (height < 1) {
			//Abaixo do range
			System.out.println("Altura "+ height + " do(a) paciente" + nome + " inválida \n O mínimo é 1 metro.");
		}
		
		else if (height > 3) {
			//Acima do Range
			System.out.println("Altura "+ height + " do(a) paciente" + nome + " inválida \n O mínimo é 1 metro.");
			
		}
		
		else if (height >= 1 && height <= 3) {
			//TRUE (Está dentro do range)
			this.height = height;
		}
		else {
			System.out.println("Altura inválida.");
		}
	}
	
	public double getHeight() {
		return this.height;
	}
	
	
	public void setWeight(int weight) {
		if (weight < 30) {
			//Abaixo do Range
			System.out.println("Peso "+ weight + " do(a) paciente" + nome + " inválido, o programa só aceita a partir de 30kg.");
		}
		else if (weight > 500) {
			//Acima do Range
			System.out.println("Peso "+ weight + " do(a) paciente" + nome + " inválido, o programa só aceita abaixo de 500kg.");
		}
		else {
			//TRUE
			this.weight = weight;
		}
	}
	
	public int getWeight() {
		return this.weight;
	}
	
	public void calculateAge() {
		
		
		
	}
	
	private double calculateImc() {
		imc = (weight/ (Math.pow(height, 2)));
		return imc;
	}
	
	public void classifyImc() {
		
	}
	
	public void showPatientProfile() {
		calculateImc();
		System.out.println("=======================");
		System.out.println("FICHA DO PACIENTE");
		System.out.println("=======================");
		System.out.println("Nome: "+ nome);
		System.out.println("Peso: "+ weight);
		System.out.println("Altura: "+ height);
		System.out.println("IMC: "+ String.format("%.2f", calculateImc()));
		System.out.println("Telefone: "+ telefone);
		System.out.println("=======================");
		System.out.println();
		
	}
	

}
