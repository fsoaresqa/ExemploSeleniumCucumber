    package StepsDefinitions;

    import io.cucumber.java.es.Dado;
    import io.cucumber.java.it.Quando;
    import io.cucumber.java.pt.Entao;
    import org.junit.Assert;
    import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.chrome.ChromeDriver;

    public class PesquisaGoogleSteps {

    WebDriver driver;

        @Dado("que eu acesse Google.com")
        public void que_eu_acesse_google_com() {
            System.setProperty("driver.chrome.driver", "C:/chromederiver.exe");

            driver =  new ChromeDriver();

            driver.get("https://www.google.com");
        }


        @Quando("realizar a pesquisa")
        public void realizar_a_pesquisa() {
            driver.findElement(By.name("q")).sendKeys("Covi-19");
            driver.findElement(By.id("lga")).click();
            driver.findElement(By.cssSelector("#tsf > div:nth-child(2) > div.A8SBwf > div.FPdoLc.tfB0Bf > center > input.gNO89b")).click();
        }

        @Entao("pesquisa e realizada com sucessoo")
        public void pesquisa_e_realiada_com_sucesso() {
        boolean resultado = driver.findElement(By.cssSelector("#Yf1RJc > div.K20DDe.B8DMnc.JXFbbc.IDHhnb > div > div > div > div.PyJv1b.gsmt.PZPZlf > span")).isDisplayed();
            Assert.assertEquals(true, resultado);


            }

    }
