public class Construct {
    public static void main(String[] args)
    {
House house1 = new House("RoseGarden");
House house2 = new House("Mantri");
House house3 = new House("Saharas");

RealEstate rs = new RealEstate();
rs.buy(house1,house2,house3);
    }
}
class House{
    String nameofsociety;
    House(String nameofsociety){
        this.nameofsociety = nameofsociety;
    }
}

class RealEstate
{
   void buy(House house1){
    System.out.println("The flat in "+house1.nameofsociety+","+house2.nameofsociety +" getting purchased");
    System.out.println("the cost of the "+house1.nameofsociety+" is 50,00,000");
    System.out.println("The rent of the "+house1.nameofsociety+"5,000" );
}
void buy(House house1,House house2){
    System.out.println("The flat in "+house1.nameofsociety+","+house2.nameofsociety +" getting purchased");
    System.out.println("the cost of the "+house1.nameofsociety+"and "+house2.nameofsociety+" is 70,00,000");
    System.out.println("The rent of the "+house1.nameofsociety+ ", "+house2.nameofsociety+ "7,000" );

}
   
void buy(House house1,House house2,House house3){
    System.out.println("The flat in "+house1.nameofsociety+","+house2.nameofsociety +","+house3.nameofsociety +" getting purchased");
    System.out.println("The cost of the "+house1.nameofsociety+"and "+house2.nameofsociety+" and"+house3.nameofsociety +"is 90,00,000");
    System.out.println("The rent of  "+house1.nameofsociety+ ", " +house2.nameofsociety+ " ," +house3.nameofsociety + "9,000" );
}
    
}