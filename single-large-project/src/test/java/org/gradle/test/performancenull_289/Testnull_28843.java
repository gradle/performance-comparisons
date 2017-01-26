package org.gradle.test.performancenull_289;

import static org.junit.Assert.*;

public class Testnull_28843 {
    private final Productionnull_28843 production = new Productionnull_28843("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}