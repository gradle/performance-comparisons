package org.gradle.test.performancenull_130;

import static org.junit.Assert.*;

public class Testnull_12951 {
    private final Productionnull_12951 production = new Productionnull_12951("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}