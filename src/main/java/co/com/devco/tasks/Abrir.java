package co.com.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.devco.userinterfaces.PetbookDir.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Abrir implements Task {

    public Abrir() {}

    public static Performable imagen() {
        return instrumented(Abrir.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
      actor.attemptsTo(Click.on(IMAGEN1));
    }
}
