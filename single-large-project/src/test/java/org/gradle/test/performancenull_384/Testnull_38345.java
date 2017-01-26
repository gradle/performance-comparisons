package org.gradle.test.performancenull_384;

import static org.junit.Assert.*;

public class Testnull_38345 {
    private final Productionnull_38345 production = new Productionnull_38345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}