package co.com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PetbookDir {
    public static final String URL = "http://localhost:4200/";
    public static final Target IMAGEN = Target.the("Imagen grande").located(By.xpath("//*[@id=\"root-component\"]/ng-component/div/div/div"));
    public static final Target PERROBTN = Target.the("Boton Perro").located(By.xpath("//*[@id=\"filterButtons\"]/div[3]/button"));
    public static final Target GATOBTN = Target.the("Boton Gato").located(By.xpath("//*[@id=\"filterButtons\"]/div[4]/button"));
    public static final Target IMAGEN1 = Target.the("imagen1").located(By.xpath("//*[@id=\"root-component\"]/app-imagegallery/div/div[3]/ul/li[1]/a/img"));

}
