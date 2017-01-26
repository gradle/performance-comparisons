package org.gradle.test.performancenull_384;

import static org.junit.Assert.*;

public class Testnull_38368 {
    private final Productionnull_38368 production = new Productionnull_38368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}