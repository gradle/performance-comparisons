package org.gradle.test.performancenull_217;

import static org.junit.Assert.*;

public class Testnull_21605 {
    private final Productionnull_21605 production = new Productionnull_21605("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}