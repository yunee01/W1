public class Driver
{
	public static void main(String [] arg)
	{
		//nemo is object
		//fish is class
		Fish nemo = new Fish();

		nemo.Swim();
		//nemo.color= "red";
		nemo.SetColor("red");
		nemo.Swim();

		//new object dory
		Fish dory = new Fish();
		
		//output blue fish swim 
		//default color is remain
		dory.Swim(); 
		//dory.color = "green";
		dory.SetColor("green");
		dory.Swim();

		Aquirium fancyAquirium = new Aquirium();
		fancyAquirium.fillFish();


	}
}