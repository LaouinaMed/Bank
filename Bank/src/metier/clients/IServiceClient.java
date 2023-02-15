package metier.clients;


import presentation.modele.Compte;

public interface IServiceClient {

        

        boolean retrait  (int choixRetrait);
        
        void dernièresOpérations();
        Double afficherSolde();
        boolean virement ();
        boolean modifierProfile(int choixModification);
        Compte choisirCompte();
        boolean versement();
        boolean retrait  ();
        void afficherTicket();

}
