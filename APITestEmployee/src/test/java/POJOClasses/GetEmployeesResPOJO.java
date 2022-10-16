package POJOClasses;

import java.util.*;



public class GetEmployeesResPOJO 
{
	private String status;
	 ArrayList < Object > data = new ArrayList < Object > ();
	 private String message;

	 public String getStatus() {
	  return status;
	 }

	 public String getMessage() {
	  return message;
	 }
	 
	 public void setStatus(String status) {
	  this.status = status;
	 }
	 private GetUserPOJO[] users;
		public GetUserPOJO[] getData() {return users;}
		public void setData(GetUserPOJO[] us) {users = us;}
}
