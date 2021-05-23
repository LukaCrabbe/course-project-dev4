public class Late extends Coffee{

    String[] cream = {"medium amouth"};
    String[] milk = {"steamed"};
    String[] flakes = {"small flakes"};
    String[] sugar = {"little bit"};



    @Override
    void addCream() {
        System.out.println("Cream: ");

        for(String cream : cream){
            System.out.println(cream + " ");
        }


    }

    @Override
    void addMilk() {
        System.out.println("Milk: ");

        for(String milk : milk){
            System.out.println(milk + " ");
        }

    }

    @Override
    void addChocolateFlakes() {
        System.out.println("Chocolate flakes: ");

        for(String flakes : flakes){
            System.out.println(flakes + " ");
        }

    }

    @Override
    void addSugar() {
        System.out.println("Sugar: ");

        for(String sugar : sugar){
            System.out.println(sugar + " ");
        }

    }
    public static String lateComplete(){
        return "late is made";
    }
}
