package org.gradle.test.performancenull_216;

import static org.junit.Assert.*;

public class Testnull_21535 {
    private final Productionnull_21535 production = new Productionnull_21535("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}