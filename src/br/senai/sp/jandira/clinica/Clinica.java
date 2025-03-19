package br.senai.sp.jandira.clinica;

public class Clinica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


				Paciente paciente1 = new Paciente();
				paciente1.setName("jose");
				paciente1.setHeight(1.65);
				paciente1.setWeight(55);
				paciente1.telefone = "(11)9918-7890" ;
				paciente1.birthDate = LocalDate.of(2000, 2, 19);
				
				paciente1.showPatientProfile();
				
				
				Paciente paciente2 = new Paciente();
				paciente2.setName("Breno");
				paciente2.setHeight(1.70);
				paciente2.setWeight(59);
				paciente2.telefone = "(11)4002-8922";
				paciente2.birthDate = LocalDate.of(2002, 9, 23);

				paciente2.showPatientProfile();
				
				Paciente paciente3 = new Paciente();
				paciente3.setName("Arlindo");
				paciente3.setHeight(1.80);
				paciente3.setWeight(78);
				paciente3.telefone = "(11)4002-8922";
				paciente3.birthDate = LocalDate.of(2002, 9, 23);
				
				paciente3.showPatientProfile();

			
				
			}
	}


