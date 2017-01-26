package org.gradle.test.performancenull_321;

import static org.junit.Assert.*;

public class Testnull_32052 {
    private final Productionnull_32052 production = new Productionnull_32052("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}