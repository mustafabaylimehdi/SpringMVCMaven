package com.luv2code.springdemo;

public class FootballCoach implements Coach{
    //define a private field for dependency
    private FortuneService fortuneService;

    //define a constructor for dependency injection
    public FootballCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "Need to exercise 10 minutes before the game";
    }

    @Override
    public String getFortune() {
        //use my fortuneService to get a fortune
        return "Football " + fortuneService.getFortune();
    }
}
