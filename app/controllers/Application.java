package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        render();
    }
    public static void login() {
        render();
    }
    public static void loginIn(String username, String password) {
    	System.out.println(username+"      "+password);
    	
    	User user = User.find("byUsernameAndPassword", username,password).first();
    	if(user != null)
    	{
            session.put("username", username);
            System.out.println(username);
            index();
    	}

        params.flash();
        flash.error("用户名或密码错误");
        login();
    }
}