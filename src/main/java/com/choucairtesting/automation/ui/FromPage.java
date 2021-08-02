package com.choucairtesting.automation.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FromPage{
public static String URL="https://www.choucairtesting.com/contactenos/";
 public static final Target  TEMA_DE_INTERES_INPUT=Target.the("").located(By.id("cursos y certificaciones"));
    public static final Target  NAME_INPUT=Target.the("").located(By.id("nombre"));
    public static final Target  FRISTNAME_INPUT=Target.the("").located(By.id("apellido"));
    public static final Target  EMAIL_INPUT=Target.the("").located(By.id("correo electronico"));
    public static final Target  CITY_INPUT=Target.the("").located(By.id("ciudad"));
    public static final Target  BUSINESS_INPUT=Target.the("").located(By.id("empresa"));
    public static final Target  NUM_MOBILE_INPUT=Target.the("").located(By.id("celular"));
    public static final Target  MESSAGE_INPUT=Target.the("").located(By.id("mensaje"));
   public static final Target SEGURITY_INPUT=Target.the("").located(By.id("aceptas politicas de privacidad"));

   public static final Target SUBMIT_BUTTON = Target.the("").located(By.id("enviar"));

}
