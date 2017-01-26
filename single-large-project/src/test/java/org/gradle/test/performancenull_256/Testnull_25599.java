package org.gradle.test.performancenull_256;

import static org.junit.Assert.*;

public class Testnull_25599 {
    private final Productionnull_25599 production = new Productionnull_25599("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}