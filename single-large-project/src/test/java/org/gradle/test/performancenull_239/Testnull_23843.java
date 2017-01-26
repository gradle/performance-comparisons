package org.gradle.test.performancenull_239;

import static org.junit.Assert.*;

public class Testnull_23843 {
    private final Productionnull_23843 production = new Productionnull_23843("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}