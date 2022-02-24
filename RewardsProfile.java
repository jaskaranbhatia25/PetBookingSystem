package edu.ucalgary.ensf409;
import java.util.regex.*;



public class RewardsProfile{
	private String rewardsNum = "Not enrolled";
	private int pointsTotal = 10;
	
	
	public RewardsProfile(){
	}
	
	public RewardsProfile(String newNumber) throws InvalidRewardsNumException{
		Pattern myPattern = Pattern.compile("^\\d{7}$");
		Matcher myMatcher = myPattern.matcher(newNumber);
		if(!myMatcher.find()){
			throw new InvalidRewardsNumException();
		}
		else{
			this.rewardsNum = newNumber;
		}
	}
	
   
	public void setPoints(int addPoints){
		this.pointsTotal += addPoints;
	}
	public int getPoints(){
		return this.pointsTotal;
	}
	public String getNumber(){
		return this.rewardsNum;
	}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	