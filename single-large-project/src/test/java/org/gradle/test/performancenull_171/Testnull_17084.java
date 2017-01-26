package org.gradle.test.performancenull_171;

import static org.junit.Assert.*;

public class Testnull_17084 {
    private final Productionnull_17084 production = new Productionnull_17084("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}