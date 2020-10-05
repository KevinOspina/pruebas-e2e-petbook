package co.com.devco.questions;

import com.gargoylesoftware.htmlunit.javascript.host.Console;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.List;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class Imagenes implements Question<Boolean> {
    private String algo;

    public Imagenes(String algo){
        this.algo = algo;
    }

    public static Imagenes son(String algo){

        return new Imagenes(algo);

    }

    @Override
    public Boolean answeredBy(Actor actor) {

        WebDriver driver = getDriver();
        List<WebElement> fotos = getDriver().findElements(By.tagName("li"));

        System.out.println("cantidad de fotos "+fotos.size());
        System.out.println(this.algo);


        HashMap<String, Integer> MapaFotos = new HashMap<String, Integer>();
        MapaFotos.put("perro", 3);
        MapaFotos.put("gato", 2);
        MapaFotos.put("all", 5);
        if(this.algo.equalsIgnoreCase("algo")){
            System.out.println("estado algo : "+ (MapaFotos.get(this.algo)==fotos.size()));
            return (MapaFotos.get(this.algo).equals(fotos.size()));
        }else{
            return (MapaFotos.get(this.algo).equals(fotos.size()));
        }

    }
}
