package org.gradle.test.performancenull_423;

import static org.junit.Assert.*;

public class Testnull_42249 {
    private final Productionnull_42249 production = new Productionnull_42249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}