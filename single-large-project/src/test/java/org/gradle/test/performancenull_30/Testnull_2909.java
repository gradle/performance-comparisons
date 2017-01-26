package org.gradle.test.performancenull_30;

import static org.junit.Assert.*;

public class Testnull_2909 {
    private final Productionnull_2909 production = new Productionnull_2909("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}