package org.gradle.test.performancenull_414;

import static org.junit.Assert.*;

public class Testnull_41343 {
    private final Productionnull_41343 production = new Productionnull_41343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}