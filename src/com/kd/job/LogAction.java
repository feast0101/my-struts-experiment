
package com.kd.job;

import java.util.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import	javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

 public final class LogAction extends Action 
 {
    private String username;
    private String password;
    
    boolean allow=false;
 
   public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest request,
		   HttpServletResponse response)throws Exception
	    {  
	      Aspirant asp=new Aspirant();
	      LogForm formdata=(LogForm)form;
	      username=formdata.getUserName();
	      password=formdata.getPassword();
      	  HttpSession sess = request.getSession(true);
 
   if(username !=null && username.trim().length()>0 && password !=null && password.trim().length()>0)
                       
     { 
       allow=asp.Allow_Login(username,password);
       formdata.setAllow(allow);
   
      sess.setAttribute("user", formdata);
     
     }
    if(allow)
       
       return mapping.findForward("success");
    else
       return mapping.findForward("failure");
	 }
  }