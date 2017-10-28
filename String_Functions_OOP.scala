import java.lang.String._;
//import scala.collection.mutable.ListBuffer;
import String_Routine._;
import scala.util.control.Breaks._;

object String_Functions {
	def main(args: Array[String]){


		println("Enter The String");
		var userInput:String = scala.io.StdIn.readLine();
		var obj = new StringFunctions(userInput);        //Instantiate the class

		println("""String functions available:-
				1. Convert to lower case
				2. Convert to upper case
				3. Reverse the string
				4. Check whether the string is a Palindrome or not
				5. Exit""");

		breakable {
			while(true){
				println("Enter your choice");
				var userChoice:Int = scala.io.StdIn.readInt();

				val call = userChoice match{
				case 1 => println("Lowercase: " +obj.LowerCase());
				case 2 => println("Uppercase: " +obj.UpperCase());
				case 3 => println("Reverse String: " +obj.ReverseString());
				case 4 => println("Is Palindrome: " +obj.PalindromeCheck());
				case 5 => println("Good Choice, Bye"); sys.exit();
				case _ => println("Invalid Input,Enter a valid option");


				}
			}
		}
	}
}
