package org.gradle.test.performancenull_423;

import static org.junit.Assert.*;

public class Testnull_42261 {
    private final Productionnull_42261 production = new Productionnull_42261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}