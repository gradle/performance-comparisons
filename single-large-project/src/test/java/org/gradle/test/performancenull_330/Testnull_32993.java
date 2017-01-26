package org.gradle.test.performancenull_330;

import static org.junit.Assert.*;

public class Testnull_32993 {
    private final Productionnull_32993 production = new Productionnull_32993("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}