package org.gradle.test.performancenull_48;

import static org.junit.Assert.*;

public class Testnull_4782 {
    private final Productionnull_4782 production = new Productionnull_4782("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}