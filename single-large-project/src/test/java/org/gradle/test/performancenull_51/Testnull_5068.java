package org.gradle.test.performancenull_51;

import static org.junit.Assert.*;

public class Testnull_5068 {
    private final Productionnull_5068 production = new Productionnull_5068("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}