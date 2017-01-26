package org.gradle.test.performancenull_234;

import static org.junit.Assert.*;

public class Testnull_23376 {
    private final Productionnull_23376 production = new Productionnull_23376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}