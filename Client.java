package edu.ucalgary.ensf409;

public class Client{
	private String name;
	private String phoneNumber;
	private String address;
	public RewardsProfile rewardsInfo = new RewardsProfile();
	
	public Client(String name,String phoneNumber,String address){
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setPhoneNumber(String num){
		this.phoneNumber = phoneNumber;
	}
	public String getPhoneNumber(){
		return this.phoneNumber;
	}
    public void setAddress(String address){
        this.address = address;
    }		
	public String getAddress(){
		return this.address;
	}
	public boolean enrollRewards(String newNumber){
		try{
			this.rewardsInfo = new RewardsProfile(newNumber);
            return true;
        }catch (Exception e){
            return false;
        }
    }
	public void updatePoints(int addPoints){
	     rewardsInfo.setPoints(addPoints);
	}
	
	public int getRewardsPoints(){
		return this.rewardsInfo.getPoints();
	}
	public String getRewardsNumber(){
		return this.rewardsInfo.getNumber();
	}
}

		