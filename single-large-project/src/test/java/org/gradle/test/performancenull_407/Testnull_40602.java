package org.gradle.test.performancenull_407;

import static org.junit.Assert.*;

public class Testnull_40602 {
    private final Productionnull_40602 production = new Productionnull_40602("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}