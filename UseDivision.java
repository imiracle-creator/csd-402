// Module 10 UseDivision.Java Isaiah Miracle 05/18/2025
public class UseDivision {
    public static void main(String[] args) {
        InternationalDivision intDiv1 = new InternationalDivision("GlobalTech", 101, "Germany", "German");
        InternationalDivision intDiv2 = new InternationalDivision("AsiaTrade", 102, "Japan", "Japanese");

        DomesticDivision domDiv1 = new DomesticDivision("EastCoast", 201, "New York");
        DomesticDivision domDiv2 = new DomesticDivision("WestCoast", 202, "California");

        intDiv1.display();
        intDiv2.display();
        domDiv1.display();
        domDiv2.display();
    }
}
