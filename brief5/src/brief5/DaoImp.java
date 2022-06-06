package brief5;

import java.sql.*;



public class DaoImp implements DAO<Candidats> {
	Connection connection= DBconnection.get_connection();
	
	public DaoImp(String nom, String prenom, String mail, String adresse, String ville, String pays) {
		// TODO Auto-generated constructor stub
	}
	
	public DaoImp() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Candidats save (Candidats item) {
		try {
			String query ="INSERT INTO list (nom,prenom,email,adress,ville,pays) VALUES (?,?, ?, ?, ?,?)";
			PreparedStatement rs= connection.prepareStatement(query);

			connection.setAutoCommit(false);
			rs.setString(1,item.getNom());
			rs.setString(2,item.getPrenom());
			rs.setString(3,item.getMail());
			rs.setString(4,item.getAdresse());
			rs.setString(5,item.getVille());
			rs.setString(6,item.getPays());
			rs.execute();
			
			
	        connection.commit();
			rs.close();
			connection.close();
			
			return item;

        }catch (Exception e) {
            e.printStackTrace();
               }
        return  item;
    }	
	
	@Override
	public Candidats update(int id, Candidats item) {
		
		try{    
		      String query = "UPDATE list SET nom=?,prenom=?, email =?, adress=?,ville=?,pays=? WHERE id=? ";
		      PreparedStatement stmt = connection.prepareStatement(query);
		   
		      stmt.setString(1,item.getNom());
		      stmt.setString(2,item.getPrenom());
		      stmt.setString(3,item.getMail());
		      stmt.setString(4,item.getAdresse());
		      stmt.setString(5,item.getVille());
		      stmt.setString(6,item.getPays());
		      stmt.setInt(7, id);
		      System.out.println("updated!");
		      stmt.execute();   
		      connection.close();
		      
		       item = this.find(item.getId());
	            
	        } catch (SQLException e) {
	                e.printStackTrace();
	        }
	    	 return item ;
		
            }
            private Candidats find(int id) {
		
		         return null;
	        }
            
            @Override
        	public void delete (int id) {
        		
        		try {
                    
        			 this.connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE).executeUpdate("DELETE FROM list WHERE id = " + id );
                             
                } catch (SQLException e) {
                        e.printStackTrace();
                }
        			
            
        	}

}



