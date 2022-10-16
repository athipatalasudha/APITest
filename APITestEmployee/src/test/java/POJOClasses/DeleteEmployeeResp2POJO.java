package POJOClasses;

public class DeleteEmployeeResp2POJO 
{
	private String status;
	 private String message;
	 private float code;
	 private String errors;


	 // Getter Methods 

	 public String getStatus() {
	  return status;
	 }

	 public String getMessage() {
	  return message;
	 }

	 public float getCode() {
	  return code;
	 }

	 public String getErrors() {
	  return errors;
	 }

	 // Setter Methods 

	 public void setStatus(String status) {
	  this.status = status;
	 }

	 public void setMessage(String message) {
	  this.message = message;
	 }

	 public void setCode(float code) {
	  this.code = code;
	 }

	 public void setErrors(String errors) {
	  this.errors = errors;
	 }
}
