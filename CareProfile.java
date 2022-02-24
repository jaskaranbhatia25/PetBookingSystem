package edu.ucalgary.ensf409;
public class CareProfile{
	private String[] medList;
	private String medInstructions;
	private String feedingInstructions;
	
	public CareProfile(String[] medList,String meds,String feeding){
		this.medList = medList;
		this.medInstructions = meds;
		this.feedingInstructions = feeding;
	}
	public String summarizeCareInstructions(){
		StringBuilder jsb = new StringBuilder();
		for(int i =0; i<medList.length;i++){
			if(i==medList.length-1){
				jsb.append(medList[i]+"\n");
			}
            else{			
			    jsb.append(medList[i]+", ");
			}
        }
        jsb.append(this.medInstructions+"\n"+this.feedingInstructions);
        return jsb.toString();
	}
}










