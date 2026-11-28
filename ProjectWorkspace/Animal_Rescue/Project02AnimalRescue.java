/**
 * 
 */

/**
 * 
 */
public class Project02AnimalRescue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Test Animal Class
		Animal animal1 = new Animal ("Oliver", "Cat", 12.5, 1.0);
		Animal animal2 = new Animal ("Stella", "Dog", 50.0, 3.0);
		
		System.out.println("Name: " + animal1.getName());
		System.out.println("Species: "+ animal1.getSpecies());
		System.out.println("Weight: "+ animal1.getWeght());
		System.out.println("Daily Food: "+ animal1.getDailyFoodAmount());
		System.out.println("Weekly Food: "+ animal1.calculateWeeklyFood());
		System.out.println("Weight Category: "+ animal1.determineWeightCategory());
		System.out.println("Animal Analysis for both animals: ");
		animal1.displayAnimalAnalysis();
		animal2.displayAnimalAnalysis();
	}

}// end class
class Animal {
	private String name;
	private String species;
	private double weight;
	private double dailyFoodAmount;
	
	public Animal(String name, String species, double weight, double dailyFoodAmount) {
		this.name = name;
		this.species = species;
		this.weight = weight;
		this.dailyFoodAmount = dailyFoodAmount;	
	}
	public String getName() {
		return name;
	}	
	public double getDailyFoodAmount() {
		return dailyFoodAmount;
	}
	public double getWeght() {
		return weight;
	}
	public String getSpecies() {
		return species;
	}
	public double calculateWeeklyFood() {
		return dailyFoodAmount* 7;
	}
	public String determineWeightCategory() {
		String weightCategory = "";
		
		if (weight < 20){
			weightCategory = "Small";
		}
		else if (weight < 50){
			weightCategory = "Medium";
		}
		else if (weight < 100){
			weightCategory = "Large";
		}
		else{
			weightCategory = "Extra Large";
		}
		return weightCategory;
	}
	public void displayAnimalAnalysis() {
		System.out.println("=====Animal Summary=====");
		System.out.println("Animal Name: "+ name);
		System.out.println("Species: "+ species);
		System.out.printf("Weight: %.2f lbs\n", weight);
		System.out.println("Weight Category: "+ determineWeightCategory());
		System.out.printf("Daily Food: %.2f cups\n", dailyFoodAmount);
		System.out.printf("Weekly food amount: %.2f cups\n", calculateWeeklyFood());
	}
}//end Class
class RescueCenter{
	private String rescueName;
	private Animal[] animals;
	private int animalCount;
	
	public RescueCenter(String rescueName, int maxAnimals) {
		this.rescueName = rescueName;
		this.animals = new Animal[maxAnimals];
		this.animalCount = 0;
	}
	public String getRescueName() {
		return rescueName;
	}
	public int getAnimalCount() {
		return animalCount;
	}
	public void addAnimal(Animal newAnimal) {
		if (animalCount < animals.length) {
			animals[animalCount] = newAnimal;
			animalCount++;
		} else {
			System.out.println("Error: Rescue Full " + newAnimal.getName() + " " + newAnimal.getSpecies() + " Not added");
		}
	}
}

