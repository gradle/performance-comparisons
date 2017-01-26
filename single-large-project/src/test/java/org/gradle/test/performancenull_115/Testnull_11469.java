package org.gradle.test.performancenull_115;

import static org.junit.Assert.*;

public class Testnull_11469 {
    private final Productionnull_11469 production = new Productionnull_11469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}