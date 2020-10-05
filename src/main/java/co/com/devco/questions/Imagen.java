package co.com.devco.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Attribute;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
import static co.com.devco.userinterfaces.PetbookDir.*;

public class Imagen implements Question<Boolean> {
    private String algo;

    public Imagen(String algo){
        this.algo = algo;
    }

    public static Imagen de(String algo){
        return new Imagen(algo);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String resultado = Attribute.of(IMAGEN).named("style").viewedBy(actor).asString();
        return resultado.contains(algo);
    }
}