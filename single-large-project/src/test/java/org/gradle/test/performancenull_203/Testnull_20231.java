package org.gradle.test.performancenull_203;

import static org.junit.Assert.*;

public class Testnull_20231 {
    private final Productionnull_20231 production = new Productionnull_20231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}