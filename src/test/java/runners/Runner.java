package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags = "@nutella",
        dryRun=false
)
 /*
    Bir framework 'de bir tek Runner class 'i yeterli olabilir
    Runner classindan class body'sinde hic bir sey olmaz
    Runner class' imizi onemli yapan 2 ader annotation vardir

@RunWith(Cucumber.class) notasyonu Runner class ina calisma ozelligi katar
Bu notasyon oldugu icin Cucumber framework'umuzda Junit kullanmayi tercih ediyoruz

features : Runner dosyasinin feature dosyalarini nereden bulacafgini tarif eder
glue : step definitions dosyalarini nerede bulacagmizi gosterir
tag : o an hangi tag'i calistirmak istiyorsak onu belli eder

dryRun : iki secenek var
    dryRun=true; yazdigimizda testimiz calistirmadan sadece eksik adimlari bize verir
     */

public class Runner {
    //bir frameworkte bır tek runner classı yeterlı olabılır.
    //  runner classında class body'sinde içerisinde hiçbir şey olmaz
    //runner classımızı önemli yapan iki adet annotation vardır.
}
