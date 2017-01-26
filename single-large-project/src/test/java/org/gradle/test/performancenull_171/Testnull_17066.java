package org.gradle.test.performancenull_171;

import static org.junit.Assert.*;

public class Testnull_17066 {
    private final Productionnull_17066 production = new Productionnull_17066("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}