package org.gradle.test.performancenull_223;

import static org.junit.Assert.*;

public class Testnull_22286 {
    private final Productionnull_22286 production = new Productionnull_22286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}