package com.choucairtesting.automation.task;

import com.choucairtesting.automation.models.DataInjection;
import com.choucairtesting.automation.ui.FromPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.questions.JavaScript;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillAllFields implements Task {
    DataInjection dataInjection = new DataInjection();

    public static Performable[] successful() {
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(dataInjection.getName()).into(FromPage.TEMA_DE_INTERES_INPUT),
                Enter.theValue(dataInjection.getName()).into(FromPage.NAME_INPUT),
                Enter.theValue(dataInjection.getEmail()).into(FromPage.EMAIL_INPUT.getCssOrXPathSelector()),
                Enter.theValue(dataInjection.getName()).into(FromPage.CITY_INPUT),
                Enter.theValue(dataInjection.getName()).into(FromPage.NUM_MOBILE_INPUT),
                Enter.theValue(dataInjection.getName()).into(FromPage.MESSAGE_INPUT),
                JavaScriptClick.on()
        );
       public static FillAllFields sucessfull() {
            return instrumented(FillAllFields.class);
        }



        }
    }
}