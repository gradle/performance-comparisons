package org.gradle.test.performancenull_340;

import static org.junit.Assert.*;

public class Testnull_33989 {
    private final Productionnull_33989 production = new Productionnull_33989("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}