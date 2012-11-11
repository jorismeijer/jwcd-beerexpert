package nl.jjjmeijer.model;

import java.util.ArrayList;
import java.util.List;

// The BeerExpert class tells me which beer to buy when I define the color

public class BeerExpert {

    public List getBrands(String color) {
        List brands = new ArrayList();
        if ("amber".equals(color)) {
            brands.add("Jack Amber");
            brands.add("Red Moose");
        } else {
            brands.add("Jail Pale Ale");
            brands.add("Gout Stout");
        }
        return brands;
    }
}
