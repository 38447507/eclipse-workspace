package imooc_1;

public class AnimalDome {
		public static void main(String[] args) {

			AnimalOperator a =new AnimalOperator();
			Cat c=new Cat();
			a.useAnimal(c);
			
			Dog d=new Dog();
			a.useAnimal(d);
		}
}
