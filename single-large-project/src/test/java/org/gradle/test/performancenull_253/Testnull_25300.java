package org.gradle.test.performancenull_253;

import static org.junit.Assert.*;

public class Testnull_25300 {
    private final Productionnull_25300 production = new Productionnull_25300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}