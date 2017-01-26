package org.gradle.test.performancenull_331;

import static org.junit.Assert.*;

public class Testnull_33096 {
    private final Productionnull_33096 production = new Productionnull_33096("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}