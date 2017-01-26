package org.gradle.test.performancenull_423;

import static org.junit.Assert.*;

public class Testnull_42293 {
    private final Productionnull_42293 production = new Productionnull_42293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}