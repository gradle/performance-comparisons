package org.gradle.test.performancenull_232;

import static org.junit.Assert.*;

public class Testnull_23165 {
    private final Productionnull_23165 production = new Productionnull_23165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}