package org.gradle.test.performancenull_419;

import static org.junit.Assert.*;

public class Testnull_41883 {
    private final Productionnull_41883 production = new Productionnull_41883("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}