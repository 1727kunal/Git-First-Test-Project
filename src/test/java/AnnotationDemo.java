import org.testng.annotations.*;

public class AnnotationDemo {
    @Test
    void firstTestMethod(){
        System.out.println("🚀First Test Method Executed...🚀");
    }
    @BeforeSuite
    void beforeSuite(){
        System.out.println("🚀Before Suite Executed...🚀");
    }
    @BeforeTest
    void beforeTest(){
        System.out.println("🚀Before Test Executed...🚀");
    }
    @BeforeClass
    void beforeClass(){
        System.out.println("🚀Before Class Executed...🚀");
    }
    @BeforeMethod
    void beforeMethod(){
        System.out.println("🚀Before Method Executed...🚀");
    }
    @AfterMethod
    void afterMethod(){
        System.out.println("🚀After Method Executed...🚀");
    }
    @AfterClass
    void afterClass(){
        System.out.println("🚀After Class Executed...🚀");
    }
    @AfterTest
    void afterTest(){
        System.out.println("🚀After Test Executed...🚀");
    }
    @AfterSuite
    void afterSuite(){
        System.out.println("🚀After Suite Executed...🚀");
    }
}
