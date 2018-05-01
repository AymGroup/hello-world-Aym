package presentation;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import metier.entities.Profil;
import metier.entities.User;
import service.IService;
import service.ServiceProfilImpl;
import service.ServiceUserImpl;

public class UserAction extends ActionSupport {
	
	private User bean;
	private List<Profil> profils;;
	private List<User> users;
	private Long idUser;
	private Long idProfil;

	private IService<User> service=new ServiceUserImpl();
	private IService<Profil> serviceProfil=new ServiceProfilImpl(); 
	
	
	public String ajouterUser() {
		
		Profil p=serviceProfil.getElement(idProfil);
		if(p!=null) {
			bean.setProfil(p);
			
			boolean b=service.ajouter(bean);
			
			if(b) {
				return "success";
			}else
				return "ERROR";	
		}
		
		return "ERROR";

	}
	
	public String deleteUser() {
		boolean b=service.supprimer(idUser);
		users=service.listAll();
		if(b) {
			return "SUCCESS";
		}else
			return "ERROR";
	}
	
	//** Get User
	public String editUser() {
		User u=service.getElement(idUser);
		if(u!=null) {
			//idUser=u.getId();
			setBean(u);
			return "success";
		}else
			return "error";
	}
	
	//** Update User
	public String modifierUser() {
		Profil p=serviceProfil.getElement(idProfil);
		
		if(p!=null){
			User u=new User(bean.getId(),bean.getLogin(),bean.getPassword(),p);
			boolean b=service.modifier(u);
			
			if(b) {
				users=service.listAll();
				return "success";
			}else
				return "error";
		}else
			return "error";
		
	}
	
	//** Search User
	public String searchUser() {
		users=service.getElementBy(bean.getLogin());
		if(users!=null) {
			return "success";
		}else
			return "error";
	}
	
	
	public String lister() {
		users=service.listAll();
		return SUCCESS;
	}
	
	public UserAction() {
		profils=serviceProfil.listAll();
		users=service.listAll();
	}
	
	/*
	@Override
	public String execute() throws Exception {
		
		return SUCCESS;
	}
	*/
	//* forward
	public String redirectUser() {
		profils=serviceProfil.listAll();
		return SUCCESS;
	}

	//* Getters & Setters for fields 	
	public List<Profil> getProfils() {
		return profils;
	}
	public void setProfils(List<Profil> profils) {
		this.profils = profils;
	}
	public User getBean() {
		return bean;
	}

	public void setBean(User bean) {
		this.bean = bean;
	}
	
	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	//** ID User parametre
	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}
	
	//** ID Profil parametre
	public Long getIdProfil() {
		return idProfil;
	}

	public void setIdProfil(Long idProfil) {
		this.idProfil = idProfil;
	}
}
