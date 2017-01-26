package org.gradle.test.performancenull_214;

import static org.junit.Assert.*;

public class Testnull_21369 {
    private final Productionnull_21369 production = new Productionnull_21369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}