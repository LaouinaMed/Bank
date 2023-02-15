package presentation.controleur;

import metier.authentification.ServiceAuth;
import presentation.modele.Banque;

public class MaBanque {
        public static ServiceAuth loginService;

        public static void main(String[] args) {

                Banque maBanque = new Banque("ZZ", "Kenitra", "0537323698", "zz@banque.ma");
                loginService = new ServiceAuth(maBanque);
                loginService.seConnecter();
        }
}
