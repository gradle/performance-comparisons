package org.gradle.test.performancenull_365;

import static org.junit.Assert.*;

public class Testnull_36475 {
    private final Productionnull_36475 production = new Productionnull_36475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}