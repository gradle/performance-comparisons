package org.gradle.test.performancenull_251;

import static org.junit.Assert.*;

public class Testnull_25099 {
    private final Productionnull_25099 production = new Productionnull_25099("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}