package level1;

public class VolumeOfEarth {
    public static void main(String[] args) {
        int radius = 6378;
        Double PI = 3.14;
        Double volOfEarthInKm = (4.0/3) * PI * (radius*radius*radius);
        Double volOfEarthInMiles = volOfEarthInKm * 1.6;
        System.out.println("The volume of earth in cubic kilometers is "+ volOfEarthInKm+" and cubic miles is "+ volOfEarthInMiles);
    }
}

//Problem 7

//Write a Program to compute the volume of Earth in km^3 and miles^3
//Hint => Volume of a Sphere is (4/3) * pi * r^3 and radius of earth is 6378 km
//O/P => The volume of earth in cubic kilometers is ____ and cubic miles is ____
