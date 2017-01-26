package org.gradle.test.performancenull_259;

import static org.junit.Assert.*;

public class Testnull_25840 {
    private final Productionnull_25840 production = new Productionnull_25840("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}