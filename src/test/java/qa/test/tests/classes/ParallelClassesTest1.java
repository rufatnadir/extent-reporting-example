package qa.test.tests.classes;

import com.relevantcodes.extentreports.LogStatus;
import org.testng.Assert;
import org.testng.annotations.Test;
import qa.test.TestNGParallelClassesTestBase;

public class ParallelClassesTest1 extends TestNGParallelClassesTestBase
{
    @Test(testName="ParallelClassesTest1.assertPass", description = "Tests a passing assertion.")
    public void assertPass()
    {
        extentTest.log(LogStatus.INFO, "First line of test.");
        Assert.assertTrue(true, "Passed assertion.");
        extentTest.log(LogStatus.INFO, "Last line of test.");
    }

}