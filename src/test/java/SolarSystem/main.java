package SolarSystem;

public class main {
    public static void main(String[] args) {
        solarSystemBasics solarSystemBasics=new solarSystemBasics();
        solarSystemBasics.Sun="1";
        solarSystemBasics.Moon="2";
        solarSystemBasics.Planets="2";
        solarSystemBasics.Stars="10";
        //feature sun
        FeatureSun featureSun=new FeatureSun();
        featureSun.name="panther";
        featureSun.color="black";
        featureSun.temp="2345kelvin";
    }
}
