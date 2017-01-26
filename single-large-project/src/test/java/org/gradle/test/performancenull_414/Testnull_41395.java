package org.gradle.test.performancenull_414;

import static org.junit.Assert.*;

public class Testnull_41395 {
    private final Productionnull_41395 production = new Productionnull_41395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}