package org.gradle.test.performancenull_315;

import static org.junit.Assert.*;

public class Testnull_31438 {
    private final Productionnull_31438 production = new Productionnull_31438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}