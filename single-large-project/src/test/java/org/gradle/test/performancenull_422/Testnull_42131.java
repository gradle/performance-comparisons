package org.gradle.test.performancenull_422;

import static org.junit.Assert.*;

public class Testnull_42131 {
    private final Productionnull_42131 production = new Productionnull_42131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}