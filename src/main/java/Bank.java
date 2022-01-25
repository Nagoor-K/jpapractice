import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bank {
	@Id
	private int bid;
	private String bname;
	private String location;
	
  public int getBid() {
  return bid;}
  public void setBid(int bid) {
  this.bid = bid;}
  
  public String getBname() {
  return bname;}
  public void setBname(String bname) {
  this.bname = bname;}
  
  public String getLocation() {
  return location;}
  public void setLocation(String location) {
  this.location = location;}
  
  @Override 
  public String toString(){return "Bank [bid=" + bid + ", bname=" + bname + ", location=" + location + "]";}
  
	
	
  
  
	
}
