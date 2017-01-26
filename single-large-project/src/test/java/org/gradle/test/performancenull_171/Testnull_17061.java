package org.gradle.test.performancenull_171;

import static org.junit.Assert.*;

public class Testnull_17061 {
    private final Productionnull_17061 production = new Productionnull_17061("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}