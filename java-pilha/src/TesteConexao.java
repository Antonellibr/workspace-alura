
public class TesteConexao {

	public static void main(String[] args) {
		
		try (Conexao conexao = new Conexao()) {			
			conexao.leDados();			
		} catch (IllegalStateException ex) {
			System.out.println("Deu erro na conexao");	
		}
		
		//----------------------------
		
		/*Conexao con = null;		
		try {
			con = new Conexao();
			con.leDados();
			//con.fecha();
		} catch (IllegalStateException ex) {
			//ex.printStackTrace();
			System.out.println("Deu erro na conexao");
			//con.fecha();
		} finally {
			System.out.println("finally");
			if (con != null) {
				con.fecha();
			}			
		}*/
	}
}
