package org.gradle.test.performancenull_171;

import static org.junit.Assert.*;

public class Testnull_17003 {
    private final Productionnull_17003 production = new Productionnull_17003("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}