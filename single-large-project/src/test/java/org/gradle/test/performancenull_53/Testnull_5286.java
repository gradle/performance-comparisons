package org.gradle.test.performancenull_53;

import static org.junit.Assert.*;

public class Testnull_5286 {
    private final Productionnull_5286 production = new Productionnull_5286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}