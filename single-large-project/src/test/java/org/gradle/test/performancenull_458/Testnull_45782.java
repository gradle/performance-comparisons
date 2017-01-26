package org.gradle.test.performancenull_458;

import static org.junit.Assert.*;

public class Testnull_45782 {
    private final Productionnull_45782 production = new Productionnull_45782("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}