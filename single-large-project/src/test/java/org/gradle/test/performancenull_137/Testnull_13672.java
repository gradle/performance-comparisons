package org.gradle.test.performancenull_137;

import static org.junit.Assert.*;

public class Testnull_13672 {
    private final Productionnull_13672 production = new Productionnull_13672("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}