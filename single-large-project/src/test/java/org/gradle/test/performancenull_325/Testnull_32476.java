package org.gradle.test.performancenull_325;

import static org.junit.Assert.*;

public class Testnull_32476 {
    private final Productionnull_32476 production = new Productionnull_32476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}