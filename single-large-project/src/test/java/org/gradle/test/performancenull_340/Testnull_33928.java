package org.gradle.test.performancenull_340;

import static org.junit.Assert.*;

public class Testnull_33928 {
    private final Productionnull_33928 production = new Productionnull_33928("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}