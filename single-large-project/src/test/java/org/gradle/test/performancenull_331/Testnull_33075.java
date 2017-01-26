package org.gradle.test.performancenull_331;

import static org.junit.Assert.*;

public class Testnull_33075 {
    private final Productionnull_33075 production = new Productionnull_33075("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}