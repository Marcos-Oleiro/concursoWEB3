package model;

import java.math.BigInteger;
import java.util.Comparator;

import javax.xml.datatype.XMLGregorianCalendar;

import jaxbmodels.Candidate;
import jaxbmodels.MathTest;
import jaxbmodels.PortTest;
import jaxbmodels.SpecTest;

public class CandidateFinal  {
	
	String port[] = {"A","C","D","E","B","C","D","E","A","D","E","C","D","E","B"};
	String math[] = {"A","B","E","A","C","E","A","B","D","A","E","A","A","C","B"};
	String spec[] = {"A","E","C","D","B","D","E","C","A","D","B","C","D","E","A","E","C","D","E","A"};
	
	private BigInteger registration_number;
	private XMLGregorianCalendar registration_date;
	private String position;
	
	private Double port_count;
	private Double math_count;
	private Double spec_count;
	private Double final_count;
	private boolean isApproved; 
	

	public CandidateFinal (Candidate c) {
		this.registration_number = c.getRegistrationNumber();
		this.position = c.getPosition();
		this.port_count = setPortCount(c);
		this.math_count = setMathCount(c);
		this.spec_count = setSpecCount(c);
		this.final_count = setFinalCount();
		this.isApproved = setIsApproved();
		this.registration_date = c.getRegistrationDate();
	}
	
	
	private Double setPortCount (Candidate c) {
		
		int success = 0;
		int fails = 0;
		PortTest pt = new PortTest();
		pt = c.getPortTest();
		
		if ( pt.getPq1().equals(port[0])) {
			success++;
		}else {
			if (!pt.getPq1().equals("N") ) fails++;
		}
		
		if ( pt.getPq2().equals(port[1])) {
			success++;
		}else {
			if (!pt.getPq2().equals("N") ) fails++;
		}
		
		if ( pt.getPq3().equals(port[2])) {
			success++;
		}else {
			if (!pt.getPq3().equals("N") ) fails++;
		}
		
		if ( pt.getPq4().equals(port[3])) {
			success++;
		}else {
			if (!pt.getPq4().equals("N") ) fails++;
		}
		
		if ( pt.getPq5().equals(port[4])) {
			success++;
		}else {
			if (!pt.getPq5().equals("N") ) fails++;
		}
		
		if ( pt.getPq6().equals(port[5])) {
			success++;
		}else {
			if (!pt.getPq6().equals("N") ) fails++;
		}
		
		if ( pt.getPq7().equals(port[6])) {
			success++;
		}else {
			if (!pt.getPq7().equals("N") ) fails++;
		}
		
		if ( pt.getPq8().equals(port[7])) {
			success++;
		}else {
			if (!pt.getPq8().equals("N") ) fails++;
		}
		
		if ( pt.getPq9().equals(port[8])) {
			success++;
		}else {
			if (!pt.getPq9().equals("N") ) fails++;
		}
		
		if ( pt.getPq10().equals(port[9])) {
			success++;
		}else {
			if (!pt.getPq10().equals("N") ) fails++;
		}
		
		if ( pt.getPq11().equals(port[10])) {
			success++;
		}else {
			if (!pt.getPq11().equals("N") ) fails++;
		}
		
		if ( pt.getPq12().equals(port[11])) {
			success++;
		}else {
			if (!pt.getPq12().equals("N") ) fails++;
		}
		
		if ( pt.getPq13().equals(port[12])) {
			success++;
		}else {
			if (!pt.getPq13().equals("N") ) fails++;
		}
		
		if ( pt.getPq14().equals(port[13])) {
			success++;
		}else {
			if (!pt.getPq14().equals("N") ) fails++;
		}
		
		if ( pt.getPq15().equals(port[14])) {
			success++;
		}else {
			if (!pt.getPq15().equals("N") ) fails++;
		}
		
		return ( ( 10 * ( success - ( 0.2 * fails ) ) ) / 15  );
	}
	
	private Double setMathCount (Candidate c) {
		
		int success = 0;
		int fails = 0;
		MathTest mt = new MathTest();
		mt = c.getMathTest();
		if ( mt.getMq1().equals(math[0])) {
			success++;
		}else {
			if (!mt.getMq1().equals("N") ) fails++;
		}
		
		if ( mt.getMq2().equals(math[1])) {
			success++;
		}else {
			if (!mt.getMq2().equals("N") ) fails++;
		}
		
		if ( mt.getMq3().equals(math[2])) {
			success++;
		}else {
			if (!mt.getMq3().equals("N") ) fails++;
		}
		
		if ( mt.getMq4().equals(math[3])) {
			success++;
		}else {
			if (!mt.getMq4().equals("N") ) fails++;
		}
		
		if ( mt.getMq5().equals(math[4])) {
			success++;
		}else {
			if (!mt.getMq5().equals("N") ) fails++;
		}
		
		if ( mt.getMq6().equals(math[5])) {
			success++;
		}else {
			if (!mt.getMq6().equals("N") ) fails++;
		}
		
		if ( mt.getMq7().equals(math[6])) {
			success++;
		}else {
			if (!mt.getMq7().equals("N") ) fails++;
		}
		
		if ( mt.getMq8().equals(math[7])) {
			success++;
		}else {
			if (!mt.getMq8().equals("N") ) fails++;
		}
		
		if ( mt.getMq9().equals(math[8])) {
			success++;
		}else {
			if (!mt.getMq9().equals("N") ) fails++;
		}
		
		if ( mt.getMq10().equals(math[9])) {
			success++;
		}else {
			if (!mt.getMq10().equals("N") ) fails++;
		}
		
		if ( mt.getMq11().equals(math[10])) {
			success++;
		}else {
			if (!mt.getMq11().equals("N") ) fails++;
		}
		
		if ( mt.getMq12().equals(math[11])) {
			success++;
		}else {
			if (!mt.getMq12().equals("N") ) fails++;
		}
		
		if ( mt.getMq13().equals(math[12])) {
			success++;
		}else {
			if (!mt.getMq13().equals("N") ) fails++;
		}
		
		if ( mt.getMq14().equals(math[13])) {
			success++;
		}else {
			if (!mt.getMq14().equals("N") ) fails++;
		}
		
		if ( mt.getMq15().equals(math[14])) {
			success++;
		}else {
			if (!mt.getMq15().equals("N") ) fails++;
		}
		
		return ( ( 10 * ( success - ( 0.2 * fails ) ) ) / 15  );
	}
	
	private Double setSpecCount (Candidate c) {
			
		int success = 0;
		int fails = 0;
		SpecTest st = new SpecTest();
		st = c.getSpecTest();
		if ( st.getSq1().equals(spec[0])) {
			success++;
		}else {
			if (!st.getSq1().equals("N") ) fails++;
		}
		
		if ( st.getSq2().equals(spec[1])) {
			success++;
		}else {
			if (!st.getSq2().equals("N") ) fails++;
		}
		
		if ( st.getSq3().equals(spec[2])) {
			success++;
		}else {
			if (!st.getSq3().equals("N") ) fails++;
		}
		
		if ( st.getSq4().equals(spec[3])) {
			success++;
		}else {
			if (!st.getSq4().equals("N") ) fails++;
		}
		
		if ( st.getSq5().equals(spec[4])) {
			success++;
		}else {
			if (!st.getSq5().equals("N") ) fails++;
		}
		
		if ( st.getSq6().equals(spec[5])) {
			success++;
		}else {
			if (!st.getSq6().equals("N") ) fails++;
		}
		
		if ( st.getSq7().equals(spec[6])) {
			success++;
		}else {
			if (!st.getSq7().equals("N") ) fails++;
		}
		
		if ( st.getSq8().equals(spec[7])) {
			success++;
		}else {
			if (!st.getSq8().equals("N") ) fails++;
		}
		
		if ( st.getSq9().equals(spec[8])) {
			success++;
		}else {
			if (!st.getSq9().equals("N") ) fails++;
		}
		
		if ( st.getSq10().equals(spec[9])) {
			success++;
		}else {
			if (!st.getSq10().equals("N") ) fails++;
		}
		
		if ( st.getSq11().equals(spec[10])) {
			success++;
		}else {
			if (!st.getSq11().equals("N") ) fails++;
		}
		
		if ( st.getSq12().equals(spec[11])) {
			success++;
		}else {
			if (!st.getSq12().equals("N") ) fails++;
		}
		
		if ( st.getSq13().equals(spec[12])) {
			success++;
		}else {
			if (!st.getSq13().equals("N") ) fails++;
		}
		
		if ( st.getSq14().equals(spec[13])) {
			success++;
		}else {
			if (!st.getSq14().equals("N") ) fails++;
		}
		
		if ( st.getSq15().equals(spec[14])) {
			success++;
		}else {
			if (!st.getSq15().equals("N") ) fails++;
		}
		if ( st.getSq16().equals(spec[15])) {
			success++;
		}else {
			if (!st.getSq16().equals("N") ) fails++;
		}
				if ( st.getSq17().equals(spec[16])) {
			success++;
		}else {
			if (!st.getSq17().equals("N") ) fails++;
		}
				if ( st.getSq18().equals(spec[17])) {
			success++;
		}else {
			if (!st.getSq18().equals("N") ) fails++;
		}
				if ( st.getSq19().equals(spec[18])) {
			success++;
		}else {
			if (!st.getSq19().equals("N") ) fails++;
		}
				if ( st.getSq20().equals(spec[19])) {
			success++;
		}else {
			if (!st.getSq20().equals("N") ) fails++;
		}
		return ( ( 10 * ( success - ( 0.2 * fails ) ) ) / 20  );
	}

	private Double setFinalCount () {
		
		return (  ( (3*this.port_count) + (3*this.math_count) + (6*this.spec_count) ) / 12 );
	}
	
	private Boolean setIsApproved () {
		
		if ( (this.port_count < 6.0) || (this.math_count < 6.0) || (this.spec_count < 6.0)  ) {
			return false;
		}
		return true;
	}
	
	public BigInteger getRegistration_number() {
		return registration_number;
	}


	public String getPosition() {
		return position;
	}


	public Double getPort_count() {
		return port_count;
	}


	public Double getMath_count() {
		return math_count;
	}


	public Double getSpec_count() {
		return spec_count;
	}


	public Double getFinal_count() {
		return final_count;
	}


	public boolean isApproved() {
		return isApproved;
	}



	@Override
	public String toString() {
		return "CandidateFinal [registration_number=" + registration_number + ", position=" + position + ", port_count="
				+ port_count + ", math_count=" + math_count + ", spec_count=" + spec_count + ", final_count="
				+ final_count + ", isApproved=" + isApproved + "]";
	}


	
	
	public XMLGregorianCalendar getRegistration_date() {
		return registration_date;
	}


	
}


















































	