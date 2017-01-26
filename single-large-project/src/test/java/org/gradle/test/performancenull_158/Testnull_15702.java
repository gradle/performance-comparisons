package org.gradle.test.performancenull_158;

import static org.junit.Assert.*;

public class Testnull_15702 {
    private final Productionnull_15702 production = new Productionnull_15702("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}