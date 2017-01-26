package org.gradle.test.performancenull_171;

import static org.junit.Assert.*;

public class Testnull_17060 {
    private final Productionnull_17060 production = new Productionnull_17060("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}