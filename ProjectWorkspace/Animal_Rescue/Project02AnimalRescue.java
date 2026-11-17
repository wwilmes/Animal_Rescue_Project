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

	}

}
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
	public double getWeight() {
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
	
}

