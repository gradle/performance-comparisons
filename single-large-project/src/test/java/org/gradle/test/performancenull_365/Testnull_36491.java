package org.gradle.test.performancenull_365;

import static org.junit.Assert.*;

public class Testnull_36491 {
    private final Productionnull_36491 production = new Productionnull_36491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}