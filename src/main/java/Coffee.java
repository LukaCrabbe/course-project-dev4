public abstract class Coffee {

    final void makeCoffee(){

        grindBeans();

        if(wantMilk()){
            addMilk();
        }
        if(wantCream()){
            addCream();
        }
        if(wantChocolateFlakes()){
            addChocolateFlakes();
        }
        if(wantSugar()){
            addSugar();
        }


        serveCoffee();

    }

    public void grindBeans(){
        System.out.println("Grinding the Beans");
    }



    abstract void addCream();
    abstract void addMilk();
    abstract void addChocolateFlakes();
    abstract void addSugar();

    boolean wantMilk(){return true;}
    boolean wantCream(){return true;}
    boolean wantChocolateFlakes(){return true;}
    boolean wantSugar(){return true;}


    public static String serveCoffee(){
      return "Served";
    }

}
