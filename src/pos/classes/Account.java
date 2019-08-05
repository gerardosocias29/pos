/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos.classes;

import com.alee.laf.rootpane.WebDialog;
import pos.ui.Login;

/**
 *
 * @author Gerardo
 */
public class Account{
    private static String name;
    private static String username;
    private static String role_name;

    public Account() {}
    
    public String Account(){
        return name+":"+username+":"+role_name;
    }
    
    public void set_account_name(String name){
        Account.name = name;
    }
    public String get_account_name(){
        return Account.name;
    }
    public void set_user_name(String username){
        Account.username = username;
    }
    public String get_user_name(){
        return Account.username;
    }
    public void set_role_name(String role){
        Account.role_name = role;
    }
    public String get_role_name(){
        return Account.role_name;
    }
}
