package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3118 {
    private final Productionnull_3118 production = new Productionnull_3118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}