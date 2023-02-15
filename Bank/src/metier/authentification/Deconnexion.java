package metier.authentification;

import metier.InteractiveConsole;

public class Deconnexion implements IAuth, InteractiveConsole{

	

	

	@Override
	public void SeDéconnecter() {
		System.out.println("Au revoir");
		fermerClavier();
	}
	
	@Override
	public void seConnecter() {
		// TODO Auto-generated method stub
		
	}
	
	public Deconnexion() {
		// TODO Auto-generated constructor stub
	}

}
