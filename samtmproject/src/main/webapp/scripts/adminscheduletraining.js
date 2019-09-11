/**
 * 
 */
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
	         
	      document.querySelector("form").addEventListener('submit', function()
	    		  {
	    	  
	    	      //call the servlet		         
		         ajaxObject.open("post","../AdminScheduleTrainingServlet",true);  
		         //read the form values
				var trainingId=document.querySelector("#trainingId").value;
				var trainingName=document.querySelector("#trainingName").value;
				var domain=document.querySelector("#domain").value;
				var startDate=document.querySelector("#startDate").value;
				var endDate=document.querySelector("#endDate").value;
				var venue=document.querySelector("#venue").value;
				ajaxObject.setRequestHeader("Content-Type","application/x-www-form-urlencoded;"); 
				//send parameters
				ajaxObject.send("trainingId="+trainingId+"&trainingName="+trainingName+"&domain="+ domain+"&startDate="+startDate+"&endDate="+endDate+"&venue="+venue);
                var formRef=document.querySelector("form");
			ajaxObject=onreadystatechange=function()
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



