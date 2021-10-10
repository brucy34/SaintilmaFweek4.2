package core;

import core.model.DAO;
import core.model.Expressions;
import core.tools.Display;
import core.tools.Utils;


public class PlayBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Display.showResult(Utils.sum(5,5));
		        DAO.getInstance().getExpressionList().add(new Expressions("35+15x20"));
		        for (Expressions expression:DAO.getInstance().getExpressionList()){
		            Display.showResult(expression.getExprs()+"="+expression.resolveExprs());

		        }
		    }
	}


