
/**
 * driver for device class
 *
 * @author Kayden Grant
 * @version 11/24/20
 */
public class GrantKayden_HW7_Driver
{
    public static void main(String[] args)
    {
        System.out.println("POSITIVE TESTING");
        GrantKayden_HW7 d1 = new GrantKayden_HW7("Iphone 6"); //GrantKayden_HW7 (device class)
        String[][] featureList2 = new String[8][2];
        GrantKayden_HW7 d2 = new GrantKayden_HW7("Iphone 7", featureList2);
        d1.addFeature("TikTok", "46MB");
        d1.addFeature("Clash of Clans", "120MB");
        d1.addFeature("Camera", "25MB");
        d2.addFeature("Solitare", "15MB");
        d2.addFeature("Banking", "10MB");
        d2.addFeature("Amazon", "30MB");
        System.out.println("Camera feature value: "+d1.getFeatureValue("Camera"));
        System.out.println("Clash of Clans feature value: "+d1.getFeatureValue(2));
        d1.showFeatures();
        System.out.println();
        System.out.println("NEGATIVE TESTING");
        GrantKayden_HW7 d3 = new GrantKayden_HW7("");
        String[][] featureList3 = new String[81][24];
        GrantKayden_HW7 d4 = new GrantKayden_HW7("", featureList3);
        d1.addFeature("TikTok", "42MB");
        System.out.println("Random feature value: "+d1.getFeatureValue("Random"));
        System.out.println("Random feature value: "+d1.getFeatureValue(-1));
        System.out.println();
        System.out.println("BOUNDARY TESTING");
        String[][] featureList4 = new String[10][2];
        GrantKayden_HW7 d5 = new GrantKayden_HW7("Iphone 8", featureList4);
        String[][] featureList5 = new String[11][2];
        GrantKayden_HW7 d6 = new GrantKayden_HW7("Iphone 10", featureList5);
        //d6.addFeature(15);
        d6.showFeatures();
    }
}
