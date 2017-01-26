package org.gradle.test.performancenull_331;

import static org.junit.Assert.*;

public class Testnull_33099 {
    private final Productionnull_33099 production = new Productionnull_33099("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}