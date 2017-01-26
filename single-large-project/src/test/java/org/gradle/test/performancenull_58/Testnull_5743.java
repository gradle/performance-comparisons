package org.gradle.test.performancenull_58;

import static org.junit.Assert.*;

public class Testnull_5743 {
    private final Productionnull_5743 production = new Productionnull_5743("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}