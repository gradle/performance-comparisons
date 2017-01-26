package org.gradle.test.performancenull_250;

import static org.junit.Assert.*;

public class Testnull_24998 {
    private final Productionnull_24998 production = new Productionnull_24998("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}