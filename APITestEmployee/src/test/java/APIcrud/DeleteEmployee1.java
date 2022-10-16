package APIcrud;

import org.testng.Assert;

import POJOClasses.DeleteEmployeeResp1POJO;
import POJOClasses.DeleteEmployeeResp2POJO;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class DeleteEmployee1 
{
	public static void DeleteEmployee1(String str)
	{
		RestAssured.baseURI="https://dummy.restapiexample.com/api/v1";
		RestAssured.basePath="/delete/"+str;
		Response res=RestAssured
				 .given()
				 .contentType(ContentType.JSON)
				 .when()
				 .delete();
		
		DeleteEmployeeResp1POJO dr=res.as(DeleteEmployeeResp1POJO.class);
		Assert.assertEquals(res.getStatusCode(),Integer.parseInt("200"));
		Assert.assertEquals(dr.getStatus(),"success");
		Assert.assertEquals(dr.getData(),str);
		String msg=dr.getMessage();
		System.out.println("\n"+msg);
	}
	public static void DeleteEmployee2(String str)
	{
		RestAssured.baseURI="https://dummy.restapiexample.com/api/v1";
		RestAssured.basePath="/delete/"+str;
		Response res=RestAssured
				 .given()
				 .contentType(ContentType.JSON)
				 .when()
				 .delete();
		
		DeleteEmployeeResp2POJO dr=res.as(DeleteEmployeeResp2POJO.class);
		Assert.assertEquals(res.getStatusCode(),Integer.parseInt("400"));
		Assert.assertEquals(dr.getStatus(),"error");
		
		String msg=dr.getMessage();
		System.out.println("\n Error :"+msg);
	}
}
