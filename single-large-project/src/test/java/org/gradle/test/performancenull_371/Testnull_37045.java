package org.gradle.test.performancenull_371;

import static org.junit.Assert.*;

public class Testnull_37045 {
    private final Productionnull_37045 production = new Productionnull_37045("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}