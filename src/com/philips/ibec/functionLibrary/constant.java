/*
 * BY: Abhishek Pathak 
 * 06-Dec-2019 This class will hold and return all the constant values used across the the entire project
 * Please add here as per the requirement
 */

package com.philips.ibec.functionLibrary;

public class constant {
	
	private String EMRA_URL;
	private String EMRB_URL;
	private String IAM_URL;
	private String Lookuptable_URL;
	
	public constant(String EMRA_URL,String EMRB_URL,String IAM_URL,String Lookuptable_URL  ) {
		
		this.EMRA_URL=EMRA_URL;
		this.EMRB_URL=EMRB_URL;
		this.IAM_URL=IAM_URL;
		this.Lookuptable_URL=Lookuptable_URL;
		
	}
	
	public String EMRA_URL()
	{
		return EMRA_URL;
	}
	
	public String EMRB_URL()
	{
		return EMRB_URL;
	}
	
	public String IAM_URL()
	{
		return IAM_URL;
	}
	
	public String Lookuptable_URL()
	{
		return Lookuptable_URL;
	}

}
