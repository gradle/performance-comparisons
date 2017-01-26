package org.gradle.test.performancenull_321;

import static org.junit.Assert.*;

public class Testnull_32043 {
    private final Productionnull_32043 production = new Productionnull_32043("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}