package org.gradle.test.performancenull_423;

import static org.junit.Assert.*;

public class Testnull_42220 {
    private final Productionnull_42220 production = new Productionnull_42220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}