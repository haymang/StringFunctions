package String_Routine;
import scala.collection.mutable.ListBuffer;

object STR{

	def LowerCase(str:String):String= {

			var string_lowercase = "";
			for(i <- 0 to str.length()-1){
				var aChar =  str.charAt(i);
				if(65 <= aChar && aChar <= 90){
					aChar = (str.charAt(i) + 32).toChar;
					string_lowercase += aChar.toString;
				}
				else{
				  string_lowercase += aChar.toString;
				}
			}
			return string_lowercase;
	}

	def UpperCase(str:String):String= {

			var string_uppercase = "";
			for(i <- 0 to str.length()-1){
				var aChar =  str.charAt(i);
				if(97 <= aChar && aChar <= 122){
					aChar = (str.charAt(i) - 32).toChar;
					string_uppercase += aChar.toString;
				}
				else{
				  string_uppercase += aChar.toString;
				}
			}
			return string_uppercase;
	}
	
	def ReverseString(str:String):String = {
	  var reverse = "";
	  
	  for(i <- str.length-1 to 0 by -1){
	    var aChar = str.charAt(i);
	    reverse += aChar.toString();
	  }
	  return reverse;
	}
	
	def PalindromeCheck(str:String):Boolean = {
	  var reverse = ReverseString(str);
	  
	  if(str.equalsIgnoreCase(reverse)){
	    return true;
	  }
	  else{
	    return false;
	  }
	}
}
