package core.model;

import core.tools.*;

public class Perimeter {
	
	public static float periCarr(float cote)
	{
		return Utils.mult(cote, (float)4);
	}
	
	public static float periRect(float longr,float larg)
	{
		return Utils.mult(Utils.sum(longr, larg), (float)2);
	}
	
	public static float periTri(float aCote,float bCote,float cCote)
	{
		return Utils.sum(Utils.sum(aCote, bCote), cCote);
	}

}
