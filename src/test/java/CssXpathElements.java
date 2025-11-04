import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static org.openqa.selenium.bidi.script.LocalValue.setValue;

public class CssXpathElements {
    void cssXpathExamples(){
        $("[data-testid=email]").setValue("1");
        $(by("data-testid","email")).setValue("1");
        $("#email").setValue("1");
        $("input#email").setValue("1");
        $x("//*[@id='email']").setValue("1");
        $(byName("email")).setValue("1");

        // searching with class
        $("[class=login_form_input_box]").setValue("1");
        $(".login_form_input_box").setValue("1");


        // <div class="inputtext">
        //      <input type="email" class "login_form_input_box">
        // </div>
        $(".inputtext.login_form_input_box").setValue("1");
        $("input.inputtext.login_form_input_box").setValue("1");
        $("inputtext").$("login_form_input_box").setValue("1");

        //<div> Hey yo </div>
        $(byText("Hey yo"));
        $(withText("Hey yo"));

    }
}
