package org.gradle.test.performancenull_54;

import static org.junit.Assert.*;

public class Testnull_5348 {
    private final Productionnull_5348 production = new Productionnull_5348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}