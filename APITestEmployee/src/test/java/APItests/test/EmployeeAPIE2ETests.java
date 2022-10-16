package APItests.test;
import POJOClasses.*;
import io.restassured.response.Response;

import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import APIcrud.*;
import APIhelpers.ReusableMethods;
@Listeners(APIhelpers.ListenersTest.class)
public class EmployeeAPIE2ETests extends ReusableMethods
{
	@Test 
	
	public void TC01()
	{
		
		Response res=GetEmployees.GetEmployees();
		res.then().body("status",Matchers.equalTo("success"));
		System.out.println("\n Status 'Success' is present ");
		
		int empcount=res.jsonPath().get("data.size()");
		System.out.println("\n THe no of employee entrees is "+empcount);
		
		Assert.assertEquals(res.getStatusCode(),Integer.parseInt("200"));
		System.out.println("\n Status code : 200 is present ");
		
	}
	@Test
	public void TC02()
	{
		
		CreateEmployeeRespPOJO result=CreateEmployee.CreateEmploye();
		Assert.assertEquals(result.getStatus(), "success");
		System.out.println("\n Status 'Success' is present ");
		
	}
	@Test
	public void TC03()
	{
		
		CreateEmployeeRespPOJO result=CreateEmployee.CreateEmploye();
		Assert.assertEquals(result.getStatus(), "success");
		System.out.println("\n Status 'Success' is present ");
		String str=result.getData().getId();
		DeleteEmployee1.DeleteEmployee1(str);
	}
	@Test
	public void TC04()
	{
		
		DeleteEmployee1.DeleteEmployee2("0");
	}
	
	@Test
	public void TC05()
	{
		
		GetEmployeePOJO p=GetEmployees.GetEmployee();
		Assert.assertEquals(p.getData().getEmployee_name(), "Garrett Winters");
		System.out.println("\n Name verified ");
		Assert.assertEquals(p.getData().getEmployee_salary(), "170750");
		
		Assert.assertEquals(p.getData().getEmployee_age(), "63");
	}
}
