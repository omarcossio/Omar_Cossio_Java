package com.company;

import com.company.PointOfSale;
import com.company.InFactory;

public class IceCreamDesign {
    public static void main(String[] args) {

        PointOfSale x = new PointOfSale("Rocky Road");
        PointOfSale w = new PointOfSale("Tropical Madness");

        InFactory y = new InFactory("Rocky Road", 5);
        InFactory p = new InFactory("Tropical Madness", 5);
    }

}
