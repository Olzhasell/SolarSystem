package com.syntax;

public class Main {

    public static void main(String[] args) {
	// write your code here

        SolarSystem andromeda=new SolarSystem();
        andromeda.sun=1;
        andromeda.planets=2;
        andromeda.moon=4;

        FeatureSun mikeSun=new FeatureSun();
        mikeSun.color="Red";
        mikeSun.heat="8888811111111111kj";
        mikeSun.temp="6000000045454545kelvin";
        mikeSun.radius="9000000km";
        mikeSun.maritalStatus="double";


        //adding planet 1 feature
        Planet1 astronaut=new Planet1();
        astronaut.color="grey";
        astronaut.relationshipStatus="single";
        astronaut.size="9989898989km";

    }
}
