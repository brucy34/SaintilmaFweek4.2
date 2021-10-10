package core.controller;

import core.view.*;
import core.model.*;
import core.tools.Display;

public class Controller {
		
	public static float calcul(int choix)
	{
		switch(choix)
		{
		case 1:{
				switch(Interface.app(Interface.menu2()))
				{
				case 1:{
						return Perimeter.periCarr(Interface.valCar());
				       }
				case 2:{
						return Perimeter.periTri(Interface.valATri(),Interface.valBTri(),Interface.valCTri());
					   }
				case 3:{
						return Perimeter.periRect(Interface.valLongRect(), Interface.valLargRect());
					   }
				default:
					System.out.println("Erreur de saisie");
				}
			   }break;
		case 2:{
			   switch(Interface.app(Interface.menu2()))
			   {
			   case 1:{
					return Surface.surfCarr(Interface.valCar());
			       }
			   case 2:{
					return Surface.surfTri(Interface.valBaseTri(),Interface.valHautTri());
				   }
			   case 3:{
					return Surface.surfRect(Interface.valLongRect(), Interface.valLargRect());
				   }
			   default:
					System.out.println("Erreur de saisie");
			   }
		       }break;
		case 3:{
			DAO.getInstance().getExpressionList().add(new Expressions(Interface.exprs()));
	        for (Expressions expression:DAO.getInstance().getExpressionList()){
	            Display.showResult(expression.getExprs()+"="+expression.resolveExprs());
		       }
		}break;
		default:
			System.out.println("Erreur de saisie");
	}
		return (float)-1;
	}	
}
