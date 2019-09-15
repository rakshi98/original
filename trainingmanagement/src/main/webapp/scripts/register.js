//cre
window.addEventListener('load',function()
		{
	
	         var ajaxObject=null;
	         
	         try
	         {
	         ajaxObject= new XMLHttpRequest(); 
	         }
	         catch(e)
	         {
	        	 
	        	 try
	        	 {
	        		 ajaxObject=new ActiveXObject("Msxml2.XMLHTTP3.0"); 
 
	        	 }
	        	 catch(e)
	        	 {
	        		 alert("Ajax object support not available");
	        	 }
	         }
	         
	         //form reference
	         
	      document.querySelector("form").addEventListener('register', function()
	    		  {
	    	  
	    	      //call the servlet		         
		         ajaxObject.open("post","../RegisterServlet",true);  
		         //read the form values
		         var empId=document.querySelector("#empId").value;
		         var name=document.querySelector("#name").value;
		         var role=document.querySelector("#role").value;
		         var emailId=document.querySelector("#emailId").value;
		         var password=document.querySelector("#password").value;
		         var phoneNo=document.querySelector("#phoneNo").value;
		        
		         ajaxObject.setRequestHeader("Content-Type","application/x-www-form-urlencoded;"); 
		         //send parameters
		         ajaxObject.send("empId="+empId+"&name="+name+"&role="+role+"&emailId="+emailId+"&password="+password
		        		 +"&phoneNo="+phoneNo);
		         
		         var formRef=document.querySelector("form");
		         //use the ready state change event
		         ajaxObject.onreadystatechange=function()
		         {
		        	 if((ajaxObject.readyState==4)&&(ajaxObject.status==200))
		        		 {
		                   console.log(ajaxObject.responseText);
		                   element=document.createElement("p");
		                   textNode=document.createTextNode(ajaxObject.responseText);
		                   element.appendChild(textNode);
		                   formRef.appendChild(element);
		        		 }
		        	 
		         }
		         
	    	     return false;
	    	  
	    		  });   
		});
	

