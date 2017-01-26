package org.gradle.test.performancenull_4;

import static org.junit.Assert.*;

public class Testnull_340 {
    private final Productionnull_340 production = new Productionnull_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}