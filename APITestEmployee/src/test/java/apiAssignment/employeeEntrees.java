package apiAssignment;

import java.util.*;

import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
//import org.json.simple.JSONObject;

public class employeeEntrees 
{
	@Test
	
	public static void FirstTest()
	{
		Response res=RestAssured
						.given()
						.when()
						.get("https://dummy.restapiexample.com/api/v1/employees");
		String response=res.asPrettyString();
		System.out.println(response);
		res.then().body("status",Matchers.equalTo("success"));		
		
		
		int empcount=res.jsonPath().get("data.size()");
		System.out.println("\n THe no of employee entrees is "+empcount);
		
		String expname="Herrod Chandler";
		String actname=res.jsonPath().get("data.find{it->it.id==7}.employee_name");
		System.out.println("The name os employee with id :7 is "+actname);
		Assert.assertEquals(actname,expname);
		
		List ls=res.jsonPath().get("data.findAll{it->it.employee_salary>300000}");
		//.getInt("workflows.find {it.type == 'system'}.id")
		System.out.println(ls);
		
		List ls1=res.jsonPath().get("data.findAll{it->it.employee_age>60}.employee_name");
		//.getInt("workflows.find {it.type == 'system'}.id")
		System.out.println(ls1);
	}
	
}
