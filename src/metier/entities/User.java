package metier.entities;

public class User {
	
	private Long id;
	private String login;
	private String password;
	private Profil profil;
	
	public User() {
		
	}
	
	public Profil getProfil() {
		return profil;
	}

	public void setProfil(Profil profil) {
		this.profil = profil;
	}
	
	public User(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}
	
	public User(Long id,String login, String password,Profil p) {
		super();
		this.id=id;
		this.login = login;
		this.password = password;
		this.profil=p;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
