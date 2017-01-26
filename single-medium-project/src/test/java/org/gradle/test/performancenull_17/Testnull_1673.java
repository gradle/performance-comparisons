package org.gradle.test.performancenull_17;

import static org.junit.Assert.*;

public class Testnull_1673 {
    private final Productionnull_1673 production = new Productionnull_1673("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}