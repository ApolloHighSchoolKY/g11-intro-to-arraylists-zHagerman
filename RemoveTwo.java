//© A+ Computer Science
// www.apluscompsci.com

//ArrayList remove() example

import java.util.ArrayList;
import static java.lang.System.*;

public class RemoveTwo
{
	public static void main(String args[])
	{
		ArrayList<String> ray;
		ray = new ArrayList<String>();

		ray.add("d");
		out.println(ray);
		ray.add("a");
		out.println(ray);
		ray.add("b");
		out.println(ray);
		ray.remove("a");
		out.println(ray);
		ray.add("c");
		out.println(ray);
		ray.add("d");
		out.println(ray);
		ray.remove("d");
		ray.remove("d");
		ray.remove("d");

		out.println(ray);
	}
}