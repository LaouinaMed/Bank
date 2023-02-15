package dao;

import presentation.modele.*;

public interface IUtilisateurDAO extends IDao<Utilisateur, Long> {

    Utilisateur findByLoginAndPass(String login, String pass);
}
