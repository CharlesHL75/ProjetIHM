package model;

public class Admin {
	
	private String login = new String("UPSSITECH");
	private String mdp = new String("password");
	private boolean connecte = false;
	
	 private Admin() {
	 }
	 
	 private static class AdminHolder {
		 private final static Admin instance = new Admin();
	 }
	 
	 public static Admin getInstance() {
		 return AdminHolder.instance;
	 }
	    	
	    
	public boolean connexion(String login, String mdp) {
		// TODO Auto-generated method stub
		if(this.login.equals(login) && this.mdp.equals(mdp)) {
			setConnecte(true);
			return true;
		}
		else
			return false;
	}


	@Override
	public String toString() {
		return "Admin [login=" + login + ", mdp=" + mdp + ", connecte=" + connecte + "]";
	}


	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public boolean isConnecte() {
		return connecte;
	}

	public void setConnecte(boolean connecte) {
		this.connecte = connecte;
	}

}
