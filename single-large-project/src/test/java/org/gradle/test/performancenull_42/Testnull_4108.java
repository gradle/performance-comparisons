package org.gradle.test.performancenull_42;

import static org.junit.Assert.*;

public class Testnull_4108 {
    private final Productionnull_4108 production = new Productionnull_4108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}