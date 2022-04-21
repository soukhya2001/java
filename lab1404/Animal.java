package labassignment;

class Animal {
        void display()
        {
        	System.out.println("Animal lives on Land");
        }
}
class Herbivores extends Animal
{
	 void  eat()
{
         System.out.println("Animals that eat only Plants");		 
}
	
}
class Cow extends Herbivores{
	void  baby()
	{
		System.out.println("Baby cow is called a Calf");
}
}
 class Carnivores extends Animal{
	 void eat()
	 {
		 System.out.println("Animals that eat only Meat");
	 }
 }
 class Lion extends Carnivores{
	 void baby()
	 {
		 System.out.println("Baby Lion is called a Cub");
	 }
 }
 class Inheritance {
	 public static void main(String[] args)
	 {
		  Lion obj=new Lion();
		  Cow obj1=new Cow();
		  obj.display();
		  obj.eat();
		  obj.baby();
		  obj1.display();
		  obj1.eat();
		  obj1.baby();
	 }
 }
 
