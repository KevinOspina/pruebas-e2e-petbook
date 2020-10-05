package co.com.devco.stepdefinitions;

import co.com.devco.questions.Imagen;
import co.com.devco.tasks.Abrir;
import co.com.devco.tasks.Filtro;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ConsultarGatoStepDefinition {

    @Cuando("^quiera ver un gato$")
    public void quieraVerUnGato() {
        theActorInTheSpotlight().attemptsTo(Filtro.ver("gato"));
        theActorInTheSpotlight().attemptsTo(Abrir.imagen());
    }


    @Entonces("^se debe abrir la imagen del gato$")
    public void abrirImagenGato() {
        theActorInTheSpotlight().should(seeThat(
                Imagen.de("gato")
        ));
    }
}