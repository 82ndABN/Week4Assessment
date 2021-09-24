
package model;

/**
 * @author - Aaron Barker
 * CIS175 - Fall 2021
 * Sept 23, 2021
 */


public class InputFormat {
	
// DECLARATIONS
	String nounA;
	String nounB;
	String nounC;
	String adjA;
	String verbA;
	
// GETTERS AND SETTERS
	public String getNounA() {
		return nounA;
	}
	public void setNounA(String nounA) {
		this.nounA = nounA;
	}
	public String getNounB() {
		return nounB;
	}
	public void setNounB(String nounB) {
		this.nounB = nounB;
	}
	public String getNounC() {
		return nounC;
	}
	public void setNounC(String nounC) {
		this.nounC = nounC;
	}
	public String getAdjA() {
		return adjA;
	}
	public void setAdjA(String adjA) {
		this.adjA = adjA;
	}
	public String getVerbA() {
		return verbA;
	}
	public void setVerbA(String adjA) {
		this.adjA = adjA;
	}
	
	
// CONSTRUCTORS
	public InputFormat() {
		
		super();
	}
	
	public InputFormat(String nounA, String nounB, String nounC, String adjA) {
		
		super();
		this.nounA = nounA;
		this.nounB = nounB;
		this.nounC = nounC;
		this.adjA = adjA;
		
		formatInput(nounA, nounB, nounC, adjA);
	}
	
	public InputFormat(String nounA, String nounB, String verbA) {
		
		super();
		this.nounA = nounA;
		this.nounB = nounB;
		this.verbA = verbA;
		
		formatInput2(nounA, nounB, verbA);
	}
	
	
// METHODS
	public void formatInput(String a, String b, String c, String d) {
		
		setNounA(a.toLowerCase());
		setNounB(b.toLowerCase());
		setNounC(c.toLowerCase());
		setAdjA(d.toLowerCase());
	}
	
	public void formatInput2(String a, String b, String v) {
		
		setNounA(a.toLowerCase());
		setNounB(b.toLowerCase());
		setNounC(v.toLowerCase());
	}
	
	@Override
	public String toString() {
		return "inputFormat [nounA=" + nounA + ", nounB=" + nounB + ", nounC=" + nounC + ", adjA=" + adjA + "]";
	}
}
