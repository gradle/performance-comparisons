package org.gradle.test.performancenull_17;

import static org.junit.Assert.*;

public class Testnull_1643 {
    private final Productionnull_1643 production = new Productionnull_1643("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}