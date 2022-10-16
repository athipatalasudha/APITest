package APIcrud;


import org.testng.Assert;
import org.testng.annotations.Test;

import POJOClasses.GetEmployeePOJO;
import POJOClasses.GetEmployeesResPOJO;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetEmployees 
{
	public static Response GetEmployees()
	{	
		RestAssured.baseURI="https://dummy.restapiexample.com/api/v1";
		RestAssured.basePath="/employees";
		Response response=RestAssured
				 .given()
				 .when()
				 .get();
		
		//GetEmployeesResPOJO emp = response.body().as(GetEmployeesResPOJO.class);
		response.prettyPrint();
		return response;
		
	}
	
	public static GetEmployeePOJO GetEmployee()
	{	
		RestAssured.baseURI="https://dummy.restapiexample.com/api/v1";
		RestAssured.basePath="/employee/2";
		Response response=RestAssured
				 .given()
				 .when()
				 .get();
		
		//GetEmployeesResPOJO emp = response.body().as(GetEmployeesResPOJO.class);
		response.prettyPrint();
		GetEmployeePOJO p=response.as(GetEmployeePOJO.class);
		
		Assert.assertEquals(response.getStatusCode(),Integer.parseInt("200"));
		String str=response.getContentType();
		System.out.println("\n THe content type is :"+str);
		Assert.assertEquals(str,"application/json");
		return p;
	}
}
