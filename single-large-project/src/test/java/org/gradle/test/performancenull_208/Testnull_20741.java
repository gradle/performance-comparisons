package org.gradle.test.performancenull_208;

import static org.junit.Assert.*;

public class Testnull_20741 {
    private final Productionnull_20741 production = new Productionnull_20741("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}