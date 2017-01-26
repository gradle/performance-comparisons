package org.gradle.test.performancenull_52;

import static org.junit.Assert.*;

public class Testnull_5186 {
    private final Productionnull_5186 production = new Productionnull_5186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}