public class NewProject {
    //button Projects trên menu
    public static String menuProjects = "//ul[@id='side-menu']/descendant::li//span[normalize-space()='Projects']";
    //cac Xpath tuong doi trong man Project
    public static String buttonAddNewProject = "//div[@id='vueApp']/descendant::div//a[contains(.,'New Project')]   ";
    public static String headerProjectsPage = "//div[@id='vueApp']/descendant::h4//span[normalize-space()='Projects Summary']";
    //Tat ca xpath tuong doi trong man New Project
    public static String inputProjectName= "//label[@for='name']/following-sibling::input";
    public static String dropdownCustomers = "//label[@for='clientid']/following-sibling::div//button";
    public static String inputCustomer = "//button[@data-toggle='dropdown']/following-sibling::div//input[@aria-controls='bs-select-6']";
    public static String checkboxCalculate = "//label[@for='progress_from_tasks']/preceding-sibling::input";
    public static String ProgressBar = "//label[normalize-space()='Progress 0%']/following-sibling::div[contains(@class,'project_progress_slider ')]";
    public static String dropdownBillingType = "//div[contains(text(),'Nothing selected')]/ancestor::button[@title='Nothing selected']";
    public static String selectBillingType = "//a[@id='bs-select-1-1']/child::span[normalize-space()='Fixed Rate']";
    public static String dropdownStatus = "//label[@for='status']/following-sibling::div/button";
    public static String selectStatus = "//label[@for='status']/following-sibling::div//span[normalize-space()='On Hold']";
    public static String inputEstimatedHours = "//label[normalize-space()='Estimated Hours']/following-sibling::input";
    public static String dropdownMembers = "//label[contains(text(),'Members')]/following-sibling::div//button[@title='Admin Example']";
    public static String selectMembers = "(//input[@aria-label='Search'])[2]";
    public static String selectStartDate = "//label[@for='start_date']/following-sibling::div/input[@id='start_date']";
    public static String selectDeadline = "//label[@for='deadline']/following-sibling::div/input[@id='deadline']";
    public static String inputTags ="//label[@for='tags']/following::input[@placeholder='Tag']";
    public static String inputDescription ="//div[@id='mceu_15']/descendant::div[@id='mceu_34']";
    public static String buttonSave = "//button[@type='submit']";
}
