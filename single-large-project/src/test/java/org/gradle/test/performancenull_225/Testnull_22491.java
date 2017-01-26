package org.gradle.test.performancenull_225;

import static org.junit.Assert.*;

public class Testnull_22491 {
    private final Productionnull_22491 production = new Productionnull_22491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}