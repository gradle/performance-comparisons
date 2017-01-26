package org.gradle.test.performancenull_36;

import static org.junit.Assert.*;

public class Testnull_3571 {
    private final Productionnull_3571 production = new Productionnull_3571("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}