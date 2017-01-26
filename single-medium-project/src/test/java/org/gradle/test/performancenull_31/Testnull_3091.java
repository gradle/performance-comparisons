package org.gradle.test.performancenull_31;

import static org.junit.Assert.*;

public class Testnull_3091 {
    private final Productionnull_3091 production = new Productionnull_3091("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}