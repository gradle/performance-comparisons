package org.gradle.test.performancenull_423;

import static org.junit.Assert.*;

public class Testnull_42229 {
    private final Productionnull_42229 production = new Productionnull_42229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}