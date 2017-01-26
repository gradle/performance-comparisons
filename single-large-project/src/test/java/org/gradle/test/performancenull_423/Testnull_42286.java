package org.gradle.test.performancenull_423;

import static org.junit.Assert.*;

public class Testnull_42286 {
    private final Productionnull_42286 production = new Productionnull_42286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}