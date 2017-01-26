package org.gradle.test.performancenull_407;

import static org.junit.Assert.*;

public class Testnull_40605 {
    private final Productionnull_40605 production = new Productionnull_40605("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}