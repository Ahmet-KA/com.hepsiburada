package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@1",
        dryRun = false



)
public class Runner {
    /*
        Runner class'i bos bir class'dir
        bu class'da asil isi
        Class'da kullandigimiz 2 notasyon yapar
        dryRun = true secildiginde
        Runner istenen feature/scenario yu calistirmaya degil
        eksik adimları bulmaya odaklanir
        eger eksik adim yoksa
        test PASSED der
        ama bu testin calisip tum adimlarin gectigini gostermez
        SADECE eksik adim olmadigini gosteri
        EGER eksik adim bulma amacimiz yoksa
        testlerimizi normal olarak calistirmak istiyorsak
        dryRun = false secilmelidir
         */
}

