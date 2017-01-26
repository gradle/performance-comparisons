package org.gradle.test.performancenull_365;

import static org.junit.Assert.*;

public class Testnull_36465 {
    private final Productionnull_36465 production = new Productionnull_36465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}