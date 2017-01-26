package org.gradle.test.performancenull_330;

import static org.junit.Assert.*;

public class Testnull_32903 {
    private final Productionnull_32903 production = new Productionnull_32903("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}