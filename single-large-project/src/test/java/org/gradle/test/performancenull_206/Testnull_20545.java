package org.gradle.test.performancenull_206;

import static org.junit.Assert.*;

public class Testnull_20545 {
    private final Productionnull_20545 production = new Productionnull_20545("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}