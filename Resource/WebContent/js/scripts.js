function getResponse(msg,username){
	if(msg!='undefined'){
		
		if(username!="undefined"){
			alert(msg+" welcome "+username);
		}
		else{
			alert(msg);
		}
	}
	
};
function getResponseNoUser(msg){
	if(msg!='undefined'){
		alert(msg);
	}
	
};
function callJqueryAjax(action){
	  //var action = $('#name').val();
	  $.ajax(
	    {
	      url     : '/IvAl/Core',
	      method     : 'POST',
	      data     : {action: action},
	      success    : function(resultText){ $('#resultServlet').html(resultText); console.log("ok") },
	      error : function(jqXHR, exception){
	        console.log('Error occured!!');
	      }
	    }
	    );
	  };
	  function callJqueryAjaxLogin(action, user,password){
		  //var action = $('#name').val();
		  $.ajax(
		    {
		      url     : '/IvAl/Core',
		      method     : 'POST',
		      data     : {action: action, "username" : user, "password":password},
		      success    : function(resultText){ $('#resultServlet').html(resultText); console.log("ok") },
		      error : function(jqXHR, exception){
		        console.log('Error occured!!');
		      }
		    }
		    );
		  };	  
  function testcon(){
	  //var action = $('#name').val();
	  //var action = "test";
	  $.ajax(
	    {
	      url     : '/IvAl/Core',
	      method     : 'POST',
	      data     : {action: "test"},
	      success    : function(resultText){ $('#resultServlet').html(resultText); console.log("ok")},
	      error : function(jqXHR, exception){
	        console.log('Error occured!!');
	      }
	    }
	    );
	  };