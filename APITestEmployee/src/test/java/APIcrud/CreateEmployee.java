package APIcrud;

import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import POJOClasses.CreateEmployeeReqPOJO;
import POJOClasses.CreateEmployeeRespPOJO;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CreateEmployee 
{
	
	public static CreateEmployeeRespPOJO CreateEmploye()
	{
		String name="test";
		String sal="123";
		String age="23";
		RestAssured.baseURI="https://dummy.restapiexample.com/api/v1";
		RestAssured.basePath="/create";
		CreateEmployeeReqPOJO cp=new CreateEmployeeReqPOJO();
		cp.setName(name);
		cp.setSalary(sal);
		cp.setAge(age);
		Response res=RestAssured
				 .given()
				 .body(cp)
				 .contentType(ContentType.JSON)
				 .when()
				 .post();
		res.prettyPrint();
		res.then().body("status",Matchers.equalTo("success"));
		System.out.println("\n Status 'Success' is present ");
		
		
		CreateEmployeeRespPOJO cr=res.as(CreateEmployeeRespPOJO.class);
		String actname=cr.getData().getName();
		String actsal=cr.getData().getSalary();
		String actage=cr.getData().getAge();
		Assert.assertEquals(actsal, sal);
		Assert.assertEquals(actage, age);
		Assert.assertEquals(actname, name);
		return cr;
		
	}
}
