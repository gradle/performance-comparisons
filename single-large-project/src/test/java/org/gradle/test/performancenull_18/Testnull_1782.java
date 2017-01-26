package org.gradle.test.performancenull_18;

import static org.junit.Assert.*;

public class Testnull_1782 {
    private final Productionnull_1782 production = new Productionnull_1782("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}