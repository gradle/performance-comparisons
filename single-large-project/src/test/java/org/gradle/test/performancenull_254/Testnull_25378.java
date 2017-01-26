package org.gradle.test.performancenull_254;

import static org.junit.Assert.*;

public class Testnull_25378 {
    private final Productionnull_25378 production = new Productionnull_25378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}