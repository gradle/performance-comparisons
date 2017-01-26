package org.gradle.test.performancenull_491;

import static org.junit.Assert.*;

public class Testnull_49100 {
    private final Productionnull_49100 production = new Productionnull_49100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}