package Shopping_Mall;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Order
{
    private Integer or_id;
    private String or_productname;
    private String or_custname;
    private int or_phno;
    private Float or_payment;
    private String or_addr;
    
    
    
	public Order() 
	{
		super();
	}
	public Order(Integer or_id, String or_productname, String or_custname, int or_phno, Float or_payment,
			String or_addr) {
		super();
		this.or_id = or_id;
		this.or_productname = or_productname;
		this.or_custname = or_custname;
		this.or_phno = or_phno;
		this.or_payment = or_payment;
		this.or_addr = or_addr;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getOr_id() {
		return or_id;
	}
	public void setOr_id(Integer or_id) {
		this.or_id = or_id;
	}
	public String getOr_productname() {
		return or_productname;
	}
	public void setOr_productname(String or_productname) {
		this.or_productname = or_productname;
	}
	public String getOr_custname() {
		return or_custname;
	}
	public void setOr_custname(String or_custname) {
		this.or_custname = or_custname;
	}
	public int getOr_phno() {
		return or_phno;
	}
	public void setOr_phno(int or_phno) {
		this.or_phno = or_phno;
	}
	public Float getOr_payment() {
		return or_payment;
	}
	public void setOr_payment(Float or_payment) {
		this.or_payment = or_payment;
	}
	public String getOr_addr() {
		return or_addr;
	}
	public void setOr_addr(String or_addr) {
		this.or_addr = or_addr;
	}
	@Override
	public String toString() {
		return "Order [or_id=" + or_id + ", or_productname=" + or_productname + ", or_custname=" + or_custname
				+ ", or_phno=" + or_phno + ", or_payment=" + or_payment + ", or_addr=" + or_addr + "]";
	}
    
    
}
