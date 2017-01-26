package org.gradle.test.performancenull_36;

import static org.junit.Assert.*;

public class Testnull_3551 {
    private final Productionnull_3551 production = new Productionnull_3551("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}