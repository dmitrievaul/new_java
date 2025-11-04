import org.junit.jupiter.api.*;

public class JUnitExamples {

    @BeforeAll
    static void beforeAll(){
        System.out.println("Before all");
    }
    @BeforeEach
    void beforeEach(){
        System.out.println("Before each");
    }
    @AfterEach
    void afterEach(){
        System.out.println("After each");
    }
    @AfterAll
    static void afterAll(){
        System.out.println("After all");
    }
    @Test
    public void firstTest() {
        System.out.println("First Test");
    }
    @Test
    public void secondTest() {
        System.out.println("second Test");
    }
}
