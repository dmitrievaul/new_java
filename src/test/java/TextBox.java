import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TextBox {
    @Test

    void fillFormTest(){
        open("https://demoqa.com/text-box");

        $("#userName").setValue("testov_name");
        $("#userEmail").setValue("testov_name@gmail.com");
        $("#currentAddress").setValue("testov_name");
        $("#permanentAddress").setValue("testov_name");
        $("#submit").click();
        $("#output").shouldHave(text("testov_name"));
    }
}
