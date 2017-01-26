package org.gradle.test.performancenull_340;

import static org.junit.Assert.*;

public class Testnull_33929 {
    private final Productionnull_33929 production = new Productionnull_33929("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}