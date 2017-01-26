package org.gradle.test.performancenull_51;

import static org.junit.Assert.*;

public class Testnull_5099 {
    private final Productionnull_5099 production = new Productionnull_5099("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}