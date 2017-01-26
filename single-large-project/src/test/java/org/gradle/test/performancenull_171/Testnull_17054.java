package org.gradle.test.performancenull_171;

import static org.junit.Assert.*;

public class Testnull_17054 {
    private final Productionnull_17054 production = new Productionnull_17054("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}