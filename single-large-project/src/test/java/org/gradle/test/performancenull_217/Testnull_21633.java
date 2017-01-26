package org.gradle.test.performancenull_217;

import static org.junit.Assert.*;

public class Testnull_21633 {
    private final Productionnull_21633 production = new Productionnull_21633("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}