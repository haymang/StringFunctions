import java.lang.String._;
//import scala.collection.mutable.ListBuffer;
import String_Routine.STR._;

object String_Functions {
	def main(args: Array[String]){

		println("Enter The String");
		var str:String = scala.io.StdIn.readLine();

		println("Lowercase: " +LowerCase(str));
		println("Uppercase: " +UpperCase(str));
		println("Reverse String: " +ReverseString(str));
    println("Is Palindrome: " +PalindromeCheck(str));
		println("Original String: " +str);
	}

	
}