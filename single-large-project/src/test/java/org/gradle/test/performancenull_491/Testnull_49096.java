package org.gradle.test.performancenull_491;

import static org.junit.Assert.*;

public class Testnull_49096 {
    private final Productionnull_49096 production = new Productionnull_49096("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}