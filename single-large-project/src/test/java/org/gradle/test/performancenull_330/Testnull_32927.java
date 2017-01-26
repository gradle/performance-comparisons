package org.gradle.test.performancenull_330;

import static org.junit.Assert.*;

public class Testnull_32927 {
    private final Productionnull_32927 production = new Productionnull_32927("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}