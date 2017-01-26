package org.gradle.test.performancenull_115;

import static org.junit.Assert.*;

public class Testnull_11491 {
    private final Productionnull_11491 production = new Productionnull_11491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}