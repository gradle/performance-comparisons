package org.gradle.test.performancenull_35;

import static org.junit.Assert.*;

public class Testnull_3403 {
    private final Productionnull_3403 production = new Productionnull_3403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}