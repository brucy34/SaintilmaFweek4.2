package core.model;

import java.util.ArrayList;
import java.util.List;

public class DAO {
		private static DAO dao = new DAO();
		private List <Expressions> expressionList;
		
		private DAO()
		{
			expressionList = new ArrayList<>();
		}
		
		public static DAO getInstance()
		{
			return dao;
		}
		
		public List<Expressions> getExpressionList()
		{
			return expressionList;
		}
}
