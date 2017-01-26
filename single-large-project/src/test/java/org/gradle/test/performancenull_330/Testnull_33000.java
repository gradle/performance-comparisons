package org.gradle.test.performancenull_330;

import static org.junit.Assert.*;

public class Testnull_33000 {
    private final Productionnull_33000 production = new Productionnull_33000("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}