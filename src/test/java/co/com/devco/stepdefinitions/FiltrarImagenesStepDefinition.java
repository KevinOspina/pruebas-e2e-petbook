package co.com.devco.stepdefinitions;

import co.com.devco.questions.Imagenes;
import co.com.devco.tasks.Filtrar;
import cucumber.api.java.Before;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FiltrarImagenesStepDefinition {

    @Before
    public void prepareTests() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Cuando("^(.*) filtra por (.*) en petbook$")
    public void usuarioFiltraPorAlgoEnPetbook(String actor, String algo) {
        theActorCalled(actor).attemptsTo(
                Filtrar.por(algo)
        );
    }

    @Entonces("^debe ver solo fotos de (.*)")
    public void debeVerSoloFotosDeAlgo(String algo) {
        theActorInTheSpotlight().should(seeThat(
                Imagenes.son(algo)
        ));
    }

}
