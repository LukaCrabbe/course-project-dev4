public class SweetBlack extends Coffee{


    String[] sugar = {"lots"};

    boolean wantMilk(){return false;}
    boolean wantCream(){return false;}
    boolean wantChocolateFlakes(){return false;}

    @Override
    void addCream() {
    }

    @Override
    void addMilk() {
    }

    @Override
    void addChocolateFlakes() {
    }

    @Override
    void addSugar() {
        System.out.println("Sugar:");

        for(String sugar : sugar){
            System.out.println(sugar + " ");
        }

    }
    public static String sweetBlackComplete(){
        return "sweetBlack is made";
    }
}
