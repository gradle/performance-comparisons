package org.gradle.test.performancenull_385;

import static org.junit.Assert.*;

public class Testnull_38482 {
    private final Productionnull_38482 production = new Productionnull_38482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}