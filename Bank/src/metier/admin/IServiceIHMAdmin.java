package metier.admin;

import metier.authentification.IServiceIHM;

public interface IServiceIHMAdmin extends IServiceIHM {

	
	int tableauDeBord();
    int menuTrie();
    int menuComptabilité();
    int menuModification();
    int menuRecherche();
    int menuInformations();
    int menuAjout();
    int menuSuppression();
    

}
