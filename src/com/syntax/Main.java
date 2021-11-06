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

        //Planet2 features
        Planet2 bastronout=new Planet2();
        bastronout.color="pink";
        bastronout.size="3434343343km";
        bastronout.status="same as Mike s";

    }
}
