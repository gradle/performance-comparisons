package org.gradle.test.performancenull_340;

import static org.junit.Assert.*;

public class Testnull_33906 {
    private final Productionnull_33906 production = new Productionnull_33906("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}