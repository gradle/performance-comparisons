package org.gradle.test.performancenull_423;

import static org.junit.Assert.*;

public class Testnull_42258 {
    private final Productionnull_42258 production = new Productionnull_42258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}