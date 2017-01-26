package org.gradle.test.performancenull_103;

import static org.junit.Assert.*;

public class Testnull_10265 {
    private final Productionnull_10265 production = new Productionnull_10265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}