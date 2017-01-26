package org.gradle.test.performancenull_207;

import static org.junit.Assert.*;

public class Testnull_20652 {
    private final Productionnull_20652 production = new Productionnull_20652("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}