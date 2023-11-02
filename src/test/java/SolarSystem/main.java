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

        //planet1
        Planet1 p=new Planet1();
        p.name="aracadabra";
        p.color="green";
        p.temperature="10k";
        p.radius="123km";
    }
}
