package org.gradle.test.performancenull_225;

import static org.junit.Assert.*;

public class Testnull_22475 {
    private final Productionnull_22475 production = new Productionnull_22475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}