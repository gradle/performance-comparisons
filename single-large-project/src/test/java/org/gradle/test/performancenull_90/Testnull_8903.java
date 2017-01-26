package org.gradle.test.performancenull_90;

import static org.junit.Assert.*;

public class Testnull_8903 {
    private final Productionnull_8903 production = new Productionnull_8903("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}