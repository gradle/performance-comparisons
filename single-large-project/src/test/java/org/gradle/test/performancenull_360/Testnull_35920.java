package org.gradle.test.performancenull_360;

import static org.junit.Assert.*;

public class Testnull_35920 {
    private final Productionnull_35920 production = new Productionnull_35920("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}