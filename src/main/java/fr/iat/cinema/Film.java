package fr.iat.cinema;

public class Film {

    int id;
    String titre;
    String afficheNom;
    double note;

    public Film(int id, String titre, String afficheNom, double note) {
        this.id = id;
        this.titre = titre;
        this.afficheNom = afficheNom;
        this.note = note;
    }

//    @Override
//    public boolean equals(Object obj) {
//        return ((Film)obj).id==this.id;
//    }
}