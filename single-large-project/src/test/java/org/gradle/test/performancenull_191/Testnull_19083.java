package org.gradle.test.performancenull_191;

import static org.junit.Assert.*;

public class Testnull_19083 {
    private final Productionnull_19083 production = new Productionnull_19083("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}