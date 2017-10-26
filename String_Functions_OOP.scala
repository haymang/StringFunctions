import java.lang.String._;
//import scala.collection.mutable.ListBuffer;
import String_Routine._;

object String_Functions {
	def main(args: Array[String]){

	  
		println("Enter The String");
		var str:String = scala.io.StdIn.readLine();
		
		var str_obj = new STR(str);

		println("Lowercase: " +str_obj.LowerCase(str));
		println("Uppercase: " +str_obj.UpperCase(str));
		println("Reverse String: " +str_obj.ReverseString(str));
    println("Is Palindrome: " +str_obj.PalindromeCheck(str));
		println("Original String: " +str_obj);
	}

	
}