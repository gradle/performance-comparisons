package org.gradle.test.performancenull_389;

import static org.junit.Assert.*;

public class Testnull_38843 {
    private final Productionnull_38843 production = new Productionnull_38843("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}