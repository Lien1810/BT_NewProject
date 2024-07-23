import common.BaseTest;
import org.openqa.selenium.By;

public class BT_webDriver extends BaseTest {
    public static void main(String[] args) throws InterruptedException {
        createBrowser();
        //createBrowser("chrome");
        driver.navigate().to("https://crm.anhtester.com/admin/authentication");
        driver.findElement(By.xpath(AddNewCustomer.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(AddNewCustomer.inputPassword)).sendKeys("123456");
        driver.findElement(By.xpath(AddNewCustomer.buttonLogin)).click();
        Thread.sleep(1000);

        //Click vào nút Project trên menu
        driver.findElement(By.xpath(NewProject.menuProjects)).click();
        //Vào màn New Project
        driver.findElement(By.xpath(NewProject.buttonAddNewProject)).click();
        //Nhập các gia trị vào
        driver.findElement(By.xpath(NewProject.inputProjectName)).sendKeys("Dự án Test năm 2024");
        driver.findElement(By.xpath(NewProject.dropdownCustomers)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(NewProject.inputCustomer)).sendKeys("s");
        driver.findElement(By.xpath("//span[normalize-space()='Anh Tester 05062024A1']")).click();
        Thread.sleep(1000);
        boolean checkCheckBox = driver.findElement(By.xpath(NewProject.checkboxCalculate)).isSelected();
        if (checkCheckBox == false) {
            driver.findElement(By.xpath(NewProject.checkboxCalculate)).click();
        }
        System.out.println(driver.findElement(By.xpath(NewProject.checkboxCalculate)).isSelected());

        driver.findElement(By.xpath(NewProject.dropdownBillingType)).click();
        driver.findElement(By.xpath(NewProject.selectBillingType)).click();

        driver.findElement(By.xpath(NewProject.dropdownStatus)).click();
        driver.findElement(By.xpath(NewProject.selectStatus));

        driver.findElement(By.xpath(NewProject.inputEstimatedHours)).sendKeys("10");

        driver.findElement(By.xpath(NewProject.dropdownMembers)).click();
        driver.findElement(By.xpath(NewProject.selectMembers)).click();

        driver.findElement(By.xpath(NewProject.inputTags)).click();
        driver.findElement(By.xpath("//div[@id='ui-id-8']")).click();

        driver.findElement(By.xpath(NewProject.inputDescription)).sendKeys("Một ngọn lửa hồng");

        //click nút Save
        driver.findElement(By.xpath(NewProject.buttonSave)).click();

        closeBrowser();
    }
}
