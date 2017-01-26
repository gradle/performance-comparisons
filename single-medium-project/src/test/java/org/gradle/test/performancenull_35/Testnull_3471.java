package org.gradle.test.performancenull_35;

import static org.junit.Assert.*;

public class Testnull_3471 {
    private final Productionnull_3471 production = new Productionnull_3471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}