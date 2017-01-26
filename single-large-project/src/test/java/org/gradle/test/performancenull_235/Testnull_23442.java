package org.gradle.test.performancenull_235;

import static org.junit.Assert.*;

public class Testnull_23442 {
    private final Productionnull_23442 production = new Productionnull_23442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}