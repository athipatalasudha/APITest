package POJOClasses;

import java.util.ArrayList;

public class GetEmployeePOJO 
{
	private String status;
	GetUserPOJO DataObject;
	 private String message;


	 // Getter Methods 

	 public String getStatus() {
	  return status;
	 }

	 public GetUserPOJO getData() {
	  return DataObject;
	 }

	 public String getMessage() {
	  return message;
	 }

	 // Setter Methods 

	 public void setStatus(String status) {
	  this.status = status;
	 }

	 public void setData(GetUserPOJO dataObject) {
	  this.DataObject = dataObject;
	 }

	 public void setMessage(String message) {
	  this.message = message;
	 }
	
	
	
}
