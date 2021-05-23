public class CoffeeMaker {
    public static void main(String[] args){

        Coffee mondayMorning = new Late();

        mondayMorning.makeCoffee();

        System.out.println("");

        Coffee restOfTheWeek = new SweetBlack();

        restOfTheWeek.makeCoffee();
    }

}
