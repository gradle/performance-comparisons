package org.gradle.test.performancenull_33;

import static org.junit.Assert.*;

public class Testnull_3259 {
    private final Productionnull_3259 production = new Productionnull_3259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}