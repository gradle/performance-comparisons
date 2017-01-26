package org.gradle.test.performancenull_21;

import static org.junit.Assert.*;

public class Testnull_2015 {
    private final Productionnull_2015 production = new Productionnull_2015("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}