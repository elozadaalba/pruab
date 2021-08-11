package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_UNIVERSIDADC =  Target.the("Click en el boton universidad " +
            "choucair").located(By.xpath("//*[@id=\"universidad\"]/a/img"));
    public static final Target INPUT_COURSE =  Target.the("Buscar el curso " +
            "").located(By.xpath("//*[@id=\"id_q_60fcb76d7b22c\"]"));
    public static final Target BUTTON_GO =  Target.the("Click en el boton para buscar " +
            "el curso ").located(By.id("//button[@class='btn btn-secondary']"));
    public static final Target SELECT_COURSE =  Target.the("Hacer click para seleccionar el" +
            "curso ").located(By.xpath("//h4[contains(text(),'Recurzos Automatizacion Bancolombia')]"));
}
