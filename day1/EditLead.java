package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Hubbell India");
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Hubbell India");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Prasannamurthy");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Krishnan");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Prathap");
		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Utility Automation");
		
		WebElement description=driver.findElement(By.id("createLeadForm_description"));
		description.sendKeys("A story within a story, also referred to as an embedded narrative, is a literary device in which a character within a story becomes the narrator of a second story (within the first one).[1] Multiple layers of stories within stories are sometimes called nested stories. A play may have a brief play within it, such as Shakespeare's play Hamlet; a film may show the characters watching a short film; or a novel may contain a short story within the novel. A story within a story can be used in all types of narration: novels, short stories, plays, television programs, films, poems, songs, video games, and philosophical");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("prasannakrish03@gmail.com");
		
		Select dropdown = new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
		dropdown.selectByVisibleText("New York");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		driver.findElement(By.className("subMenuButton")).click();
		
		WebElement clearDescription = driver.findElement(By.id("createLeadForm_description"));
		clearDescription.clear();
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("A story within a story !@#$%^&*() 123456789");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		System.out.println(driver.getTitle());
	}
}


