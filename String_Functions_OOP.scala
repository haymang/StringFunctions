import java.lang.String._;
//import scala.collection.mutable.ListBuffer;
import String_Routine._;
import scala.util.control.Breaks._;

object String_Functions {
	def main(args: Array[String]){


		println("Enter The String");
		var userInput:String = scala.io.StdIn.readLine();
		var obj = new StringFunctions(userInput);        //Instantiate the class

		println("Functions available:- lower,upper,reverse,pallindrome");

		breakable {
			while(true){
				println("Enter you choice");
				var userChoice:String = scala.io.StdIn.readLine();
				if(userChoice.equalsIgnoreCase("lower") || userChoice.equalsIgnoreCase("upper") || userChoice.equalsIgnoreCase("reverse") || userChoice.equalsIgnoreCase("pallindrome")){
					val call = userChoice match{
					case "lower" => println("Lowercase: " +obj.LowerCase());
					case "upper" => println("Uppercase: " +obj.UpperCase());
					case "reverse" => println("Reverse String: " +obj.ReverseString());
					case "pallindrome" => println("Is Palindrome: " +obj.PalindromeCheck());


					}
					break;
				}
				else{
					println("Invalid Input,Enter a valid option")
				}
			}
		}
	}
}