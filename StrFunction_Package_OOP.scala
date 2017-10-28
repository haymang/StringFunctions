package String_Routine;

class StringFunctions(var stringInput:String){
  
  //var strMem = stringInput;
  
 // def strMem = str;
  
	def LowerCase():String= {        //To convert the string in lowercase

			var string_lowercase = "";
			for(i <- 0 to stringInput.length()-1){
				var aChar =  stringInput.charAt(i);
				if(65 <= aChar && aChar <= 90){
					aChar = (stringInput.charAt(i) + 32).toChar;
					string_lowercase += aChar;
				}
				else{
				  string_lowercase += aChar;
				}
			}
			//stringInput = string_lowercase;
			return string_lowercase;
	}

	def UpperCase():String= {        //To convert the string in uppercase

			var string_uppercase = "";
			for(i <- 0 to stringInput.length()-1){
				var aChar =  stringInput.charAt(i);
				if(97 <= aChar && aChar <= 122){
					aChar = (stringInput.charAt(i) - 32).toChar;
					string_uppercase += aChar;
				}
				else{
				  string_uppercase += aChar;
				}
			}
			return string_uppercase;
	}
	
	def ReverseString():String = {        //To reverse the string
	  var reverse = "";
	  
	  for(i <- stringInput.length-1 to 0 by -1){
	    var aChar = stringInput.charAt(i);
	    reverse += aChar.toString();
	  }
	  return reverse;
	}
	
	def PalindromeCheck():Boolean = {        //Check if string is a pallindrome
	  var reverse = ReverseString();
	  
	  if(stringInput.equalsIgnoreCase(reverse)){
	    return true;
	  }
	  else{
	    return false;
	  }
	}
}
