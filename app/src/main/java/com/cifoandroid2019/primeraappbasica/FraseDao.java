package com.cifoandroid2019.primeraappbasica;


import java.util.ArrayList;
import java.util.List;

public class FraseDao {
    private List<Frase> mFrases;

    public enum Constants{ FRASES_FETES, CITES_CELEBRES };

    public FraseDao() {
        mFrases = new ArrayList<>();

        mFrases.add(new Frase(1,"Anònim","Anar a la seva", Constants.FRASES_FETES.ordinal()));
        mFrases.add(new Frase(2, "Anònim", "Anar a l'encalç", Constants.FRASES_FETES.ordinal()));
        mFrases.add(new Frase(3, "Anònim", "Anar a pams", Constants.FRASES_FETES.ordinal()));
        mFrases.add(new Frase(4, "Anònim", "Anar a pas de  bou", Constants.FRASES_FETES.ordinal()));
        mFrases.add(new Frase(5, "Anònim", "Anar a pas de fang", Constants.FRASES_FETES.ordinal()));
        mFrases.add(new Frase(6, "Anònim", "Anar aigua avall", Constants.FRASES_FETES.ordinal()));
        mFrases.add(new Frase(7, "Anònim", "Anar brut com una guilla", Constants.FRASES_FETES.ordinal()));
        mFrases.add(new Frase(8, "Miguel Martí i Pol", "Tot està perfer it tot es possible",Constants.CITES_CELEBRES.ordinal()));
        mFrases.add(new Frase(9,"Ferran Salmurri", "La funció del pare és ensenyar els fill a ser més feliços", Constants.CITES_CELEBRES.ordinal()));
        mFrases.add(new Frase(10,"Pulitzer", "Compte amb les situacions inesperades. En elles s'amaguen la nostra oportunitat", Constants.CITES_CELEBRES.ordinal()));
        mFrases.add(new Frase(11,"Provervi japonès", "El que parla sembra, el que escolta recull", Constants.CITES_CELEBRES.ordinal()));
        mFrases.add(new Frase(12,"Anònim", "Quan una cosa dolenta et succeeixi tens dues opcions: Deixar que et destrueixi o deixar que et faci més fort", Constants.CITES_CELEBRES.ordinal()));
        mFrases.add(new Frase(13,"León Lederman", "Tota acció provoca reaccions", Constants.CITES_CELEBRES.ordinal()));
        mFrases.add(new Frase(14,"Ferran Salmurri", "El valor que tenim radica elque pensem de nosaltres mateixos i no en el que creiem que els altres pesen de nosaltres", Constants.CITES_CELEBRES.ordinal()));
        mFrases.add(new Frase(15,"Sèneca", "Tria per mestre a aquell a qui admiris més pel que en ell veiessis que pel que escoltessis dels seus llavis", Constants.CITES_CELEBRES.ordinal()));
    }

    public List<Frase> getFrases() {
        return setFilter(Constants.FRASES_FETES.ordinal());
    }

    public List<Frase> getConsells() {
        return setFilter(Constants.CITES_CELEBRES.ordinal());
    }

    private List<Frase> setFilter(int tipus) {
        List<Frase> result = new ArrayList<>();
        for (Frase temp: mFrases) {
            if (temp.getTipus() == tipus) {
                result.add(temp);
            }
        }
        return result;
    }

    public Frase getFraseById(int id) {
        for (Frase temp : mFrases) {
            if (temp.getId() == id) {
                return temp;
            }
        }
        return mFrases.get(1);
    }
}