package org.gradle.test.performancenull_343;

import static org.junit.Assert.*;

public class Testnull_34300 {
    private final Productionnull_34300 production = new Productionnull_34300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}