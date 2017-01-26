package org.gradle.test.performancenull_419;

import static org.junit.Assert.*;

public class Testnull_41803 {
    private final Productionnull_41803 production = new Productionnull_41803("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}