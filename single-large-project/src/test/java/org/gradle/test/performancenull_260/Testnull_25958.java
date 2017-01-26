package org.gradle.test.performancenull_260;

import static org.junit.Assert.*;

public class Testnull_25958 {
    private final Productionnull_25958 production = new Productionnull_25958("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}