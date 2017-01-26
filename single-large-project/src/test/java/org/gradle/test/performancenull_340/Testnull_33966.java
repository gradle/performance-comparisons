package org.gradle.test.performancenull_340;

import static org.junit.Assert.*;

public class Testnull_33966 {
    private final Productionnull_33966 production = new Productionnull_33966("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}