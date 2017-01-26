package org.gradle.test.performancenull_237;

import static org.junit.Assert.*;

public class Testnull_23619 {
    private final Productionnull_23619 production = new Productionnull_23619("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}