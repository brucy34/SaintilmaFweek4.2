package core.model;

import core.tools.*;

public class Expressions {
		
	private float num1;
	private float num2;
	private String exprs;
	
	
	public Expressions()
	{
		
	}
	
	public Expressions(String exprs)
	{
		this.exprs=exprs;
	}

	public String getExprs() {
		return exprs;
	}

	public void setExprs(String exprs) {
		this.exprs = exprs;
	}
	
	public float resolveExprs()
	{
		boolean test1,test2,test3,test4;
		int ind1=exprs.indexOf("x");
		float cal=0;
		//String chexprs="0";
		if(ind1>=0)
			 test1=true;
		else
			test1=false;
		
		int ind2=exprs.indexOf("/");
		if(ind2>=0)
			 test2=true;
		else
			test2=false;
		
		int ind3=exprs.indexOf("-");
		if(ind3>=0)
			 test3=true;
		else
			test3=false;
		
		int ind4=exprs.indexOf("+");
		if(ind4>=0)
			 test4=true;
		else
			test4=false;
		
		while(test1==true)
		{	
			num1=Float.parseFloat(exprs.substring(ind1-ind2 | ind1-ind3 | ind1-ind4,ind1));
			num2=Float.parseFloat(exprs.substring(ind1+1,ind1-ind2 | ind1-ind3 | ind1-ind4));
			
			cal=Utils.mult(num1, num2);
			
		    setExprs(exprs.replace(exprs.substring((exprs.substring(ind1-ind2 | ind1-ind3 | ind1-ind4,ind1)), exprs.substring(ind1+1,ind1-ind2 | ind1-ind3 | ind1-ind4)),cal));
		    
		    ind1=exprs.indexOf("x");
			if(ind1>=0)
				test1=true;
			else
				test1=false;
		}
		if(test1==false)
		{
		 ind2=exprs.indexOf("/");
		if(ind2>=0)
			 test2=true;
		else
			test2=false;
		System.out.println(exprs);
		
		while(test2==true && test1==false)
		{
			num1=Float.parseFloat(exprs.substring(ind2-2,ind2));
			num2=Float.parseFloat(exprs.substring(ind2+1,ind2+3));
			
			cal=Utils.divi(num1, num2);
		
		    setExprs(exprs.replace(exprs.substring(ind2-2, ind2+3), String.valueOf(cal)));
		    ind2=exprs.indexOf("/");
			if(ind2>=0)
				 test2=true;
			else
				 test2=false;
		}
			System.out.println(exprs);
		if(test2==false)
		{
		 ind3=exprs.indexOf("-");
		if(ind3>=0)
			 test3=true;
		else
			 test3=false;
			 
		while(test3==true && test2==false && test1==false)
		{
			num1=Float.parseFloat(exprs.substring(ind3-2,ind3));
			num2=Float.parseFloat(exprs.substring(ind3+1,ind3+3));
			
			cal=Utils.sous(num1, num2);
			
		    setExprs(exprs.replace(exprs.substring(ind3-2, ind3+3), String.valueOf(cal)));
		    ind3=exprs.indexOf("-");
			if(ind3>=0)
				 test3=true;
			else
				 test3=false;
		}
		if(test3==false)
		{
		 ind4=exprs.indexOf("+");
		if(ind4>=0)
			 test4=true;
		else
			test4=false;
		
		while(test4==true && test3==false && test2==false && test1==false)
		{

			num1=Float.parseFloat(exprs.substring(ind4-2,ind4));
			num2=Float.parseFloat(exprs.substring(ind4+1,ind4+3));
			
			cal=Utils.sum(num1, num2);
			
		    setExprs(exprs.replace(exprs.substring(ind4-2, ind4+3), String.valueOf(cal)));
		    ind4=exprs.indexOf("+");
			if(ind4>=0)
				 test4=true;
			else
				test4=false;
		}
		System.out.println(exprs);
	}	
		}

		}
		return cal;
	}
}
