/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.softgraf.model.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Usuario
 */
public class AcessarUsuario implements InterfaceCommand {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
    
    String login = request.getParameter("login");
    String senha = request.getParameter("senha");
    
    if(login == null) {
        return "login_usuario.jsp";                
    }
    //return "login_usuario.jsp";  
    return "SoftgrafController?cmd=iniciarSoftgraf";
    
    }
}