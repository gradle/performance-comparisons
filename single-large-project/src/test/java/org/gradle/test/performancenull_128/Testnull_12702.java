package org.gradle.test.performancenull_128;

import static org.junit.Assert.*;

public class Testnull_12702 {
    private final Productionnull_12702 production = new Productionnull_12702("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}