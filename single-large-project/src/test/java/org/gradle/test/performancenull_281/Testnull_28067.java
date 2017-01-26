package org.gradle.test.performancenull_281;

import static org.junit.Assert.*;

public class Testnull_28067 {
    private final Productionnull_28067 production = new Productionnull_28067("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}