package POJOClasses;

public class CreateEmployeeRespPOJO 
{
	private String status;
	EmployeeDataPOJO DataObject;
	 private String message;


	 // Getter Methods 

	 public String getStatus() {
	  return status;
	 }

	 public EmployeeDataPOJO getData() {
	  return DataObject;
	 }

	 public String getMessage() {
	  return message;
	 }

	 // Setter Methods 

	 public void setStatus(String status) {
	  this.status = status;
	 }

	 public void setData(EmployeeDataPOJO dataObject) {
	  this.DataObject = dataObject;
	 }

	 public void setMessage(String message) {
	  this.message = message;
	 }
	
}
