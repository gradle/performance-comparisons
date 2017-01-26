package org.gradle.test.performancenull_473;

import static org.junit.Assert.*;

public class Testnull_47286 {
    private final Productionnull_47286 production = new Productionnull_47286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}