package core.model;
import core.tools.*;

public class Surface {
	
	public static float surfCarr(float cote)
	{
		return Utils.car(cote);
	}
	
	public static float surfRect(float longr,float larg)
	{
		return Utils.mult(longr, larg);
	}
	
	public static float surfTri(float base,float haut)
	{
		return Utils.divi(Utils.mult(base, haut), (float)2);
	}

}
