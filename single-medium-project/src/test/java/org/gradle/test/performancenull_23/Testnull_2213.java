package org.gradle.test.performancenull_23;

import static org.junit.Assert.*;

public class Testnull_2213 {
    private final Productionnull_2213 production = new Productionnull_2213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}