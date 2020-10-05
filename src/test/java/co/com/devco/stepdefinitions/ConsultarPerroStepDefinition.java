package co.com.devco.stepdefinitions;

import co.com.devco.questions.Imagen;
import co.com.devco.tasks.Abrir;
import co.com.devco.tasks.Filtro;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ConsultarPerroStepDefinition {

    @Cuando("^quiera ver un perro$")
    public void quieraVerUnPerro() {
        theActorInTheSpotlight().attemptsTo(Filtro.ver("perro"));
        theActorInTheSpotlight().attemptsTo(Abrir.imagen());
    }

    @Entonces("^se debe abrir la imagen del perro$")
    public void abrirImagenPerro() {
        theActorInTheSpotlight().should(seeThat(
                Imagen.de("perro")
        ));
    }
}