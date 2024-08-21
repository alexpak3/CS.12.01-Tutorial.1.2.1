public class StepTracker {

    private int goal;
    private int activeDays;
    private int days;

    private int steps;

   public StepTracker(int goal){
   this.goal = goal;
   }
   public int getActiveDays(){
       return activeDays;
   }

   public int getDays(){
       return days;
   }

   public int getTotalSteps(){
       return steps;
   }

    public double averageSteps(){
       if(this.days<= 0.0){return 0.0;}
       else {
           return (double) this.steps / (double) this.days;
       }
    }

    public int activeDays(){
       return 0;
    }

    public void addDailySteps (int steps){
       this.days ++;
       this.steps += steps;
       if (steps >= goal){
           activeDays++;
       }
    }

    public int getStepsForActiveDay(){
    return goal;
    }

}