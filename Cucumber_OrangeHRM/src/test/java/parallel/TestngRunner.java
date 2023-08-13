//package parallel;
//
//import org.junit.runner.RunWith;
//import org.testng.annotations.DataProvider;
//
//// import io.cucumber.junit.CucumberOptions;
//
//// import cucumber.api.CucumberOptions;
//// import cucumber.api.junit.Cucumber;
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
//import io.cucumber.testng.AbstractTestNGCucumberTests;
//
//@RunWith(Cucumber.class)
//@CucumberOptions(
//		features = "C:\\Users\\003KT8744\\eclipse-workspace\\Cucumber_OrangeHRM\\src\\test\\resources\\parallel"
//		,glue={"parallel"},
//		plugin = {"pretty",
//				  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
//				  "timeline:test-output-thread/"
//		},
////		strict = true,// it will check the mapping ,but even if mapping is not correct ,it will execute but will give pending execption todo:implement me
//		monochrome = true, // gives the output in readable format
//		dryRun=false // if dryrun is true ...then it will just check the mapping.if it is flase , then it will execute the testcase
////		 
//		)
//public class TestngRunner extends AbstractTestNGCucumberTests
//{
//        @Override
//        @DataProvider(parallel = true)
//        public Object[][] scenarios()
//        {
//        	// will return all the scenarios present in the project
//        	// if we are executing in the junit , then no need to create this parallel folder ,but if we are executing using testng, then we will create testng
//        	// use of testng----> we can execute scenarios in parallel mode.
//			return super.scenarios();
//        }
//        
//}
