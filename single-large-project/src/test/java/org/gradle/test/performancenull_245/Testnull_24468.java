package org.gradle.test.performancenull_245;

import static org.junit.Assert.*;

public class Testnull_24468 {
    private final Productionnull_24468 production = new Productionnull_24468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}