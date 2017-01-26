package org.gradle.test.performancenull_128;

import static org.junit.Assert.*;

public class Testnull_12769 {
    private final Productionnull_12769 production = new Productionnull_12769("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}