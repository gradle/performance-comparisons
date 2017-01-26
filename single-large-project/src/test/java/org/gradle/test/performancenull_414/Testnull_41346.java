package org.gradle.test.performancenull_414;

import static org.junit.Assert.*;

public class Testnull_41346 {
    private final Productionnull_41346 production = new Productionnull_41346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}