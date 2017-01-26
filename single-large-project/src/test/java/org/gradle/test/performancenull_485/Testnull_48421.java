package org.gradle.test.performancenull_485;

import static org.junit.Assert.*;

public class Testnull_48421 {
    private final Productionnull_48421 production = new Productionnull_48421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}