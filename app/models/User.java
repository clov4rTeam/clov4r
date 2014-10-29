package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import play.db.jpa.Model;

@Entity
@Table(name="user")
public class User extends Model {

	//用户名
	public String username;
	//密码
	public String password;
	
	//真实姓名
	public String realUserName;
	//电话
	public String mobile;
	
	
	//邮箱
	public String email;
	public Date createDate;
}
