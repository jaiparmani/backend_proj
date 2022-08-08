/**
 * 
 */
package com.db.grad.javaapi.model;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Dell
 *
 */
@Entity
@Table(name="Security")
public class security {

	@Id
	private int securityid;
	private String isin;
	private String cusip;
	private Date maturity_date;
	private float coupon;
	private String type;
	private int facevalue;
	private String status;
	
	
	public security(int securityid, String isin, String cusip, Date maturity_date, float coupon, String type,
			int facevalue, String status) {
		super();
		this.securityid = securityid;
		this.isin = isin;
		this.cusip = cusip;
		this.maturity_date = maturity_date;
		this.coupon = coupon;
		this.type = type;
		this.facevalue = facevalue;
		this.status = status;
	}


	public int getSecurityid() {
		return securityid;
	}


	public void setSecurityid(int securityid) {
		this.securityid = securityid;
	}


	public String getIsin() {
		return isin;
	}


	public void setIsin(String isin) {
		this.isin = isin;
	}


	public String getCusip() {
		return cusip;
	}


	public void setCusip(String cusip) {
		this.cusip = cusip;
	}


	public Date getMaturity_date() {
		return maturity_date;
	}


	public void setMaturity_date(Date maturity_date) {
		this.maturity_date = maturity_date;
	}


	public float getCoupon() {
		return coupon;
	}


	public void setCoupon(float coupon) {
		this.coupon = coupon;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int getFacevalue() {
		return facevalue;
	}


	public void setFacevalue(int facevalue) {
		this.facevalue = facevalue;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}
	
	
}

