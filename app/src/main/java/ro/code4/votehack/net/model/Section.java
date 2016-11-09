package ro.code4.votehack.net.model;

import java.io.Serializable;
import java.util.List;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Section extends RealmObject implements Serializable {
    @PrimaryKey
    private String codSectiune;
    private String descriere;
    private RealmList<Question> intrebari;

    public String getSectionCode() {
        return codSectiune;
    }

    public String getDescription() {
        return descriere;
    }

    public List<Question> getQuestionList() {
        return intrebari;
    }
}