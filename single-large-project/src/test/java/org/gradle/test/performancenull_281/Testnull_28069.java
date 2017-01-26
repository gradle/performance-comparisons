package org.gradle.test.performancenull_281;

import static org.junit.Assert.*;

public class Testnull_28069 {
    private final Productionnull_28069 production = new Productionnull_28069("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}