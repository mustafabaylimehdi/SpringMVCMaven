package com.luv2code.springdemo;

public class TrackCoach implements Coach{
    //define a private field for dependency
    private FortuneService fortuneService;

    public TrackCoach(){

    }

    //define a constructor for dependency injection
    public TrackCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "Run hard 5k";
    }

    @Override
    public String getFortune() {
        //use my fortuneService to get a fortune
        return "Track " + fortuneService.getFortune();
    }

    //init method
    public void doMyStartupStuff(){
        System.out.println("TrackCoach: inside method doMySrartupStuff");
    }

    //destroy method
    public void doMyCleanupStuffYoYo(){
        System.out.println("TrackCoach: inside method doMyCleanupStuffYoYo");
    }
}
