package org.gradle.test.performancenull_132;

import static org.junit.Assert.*;

public class Testnull_13175 {
    private final Productionnull_13175 production = new Productionnull_13175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}