package co.com.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;


import static co.com.devco.userinterfaces.PetbookDir.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Filtro implements Task {

    private String filtro;

    public Filtro(String filtro) {
        this.filtro = filtro;
    }

    public static Performable ver(String filtro) {
        return instrumented(Filtro.class, filtro);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if(filtro == "perro") {
            actor.attemptsTo(
                    Click.on(PERROBTN)
            );
        }else if(filtro == "gato"){
            actor.attemptsTo(
                    Click.on(GATOBTN)
            );
        }

    }
}
