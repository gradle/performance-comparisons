package org.gradle.test.performancenull_127;

import static org.junit.Assert.*;

public class Testnull_12698 {
    private final Productionnull_12698 production = new Productionnull_12698("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}