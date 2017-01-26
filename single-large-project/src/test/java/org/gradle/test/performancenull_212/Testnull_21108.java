package org.gradle.test.performancenull_212;

import static org.junit.Assert.*;

public class Testnull_21108 {
    private final Productionnull_21108 production = new Productionnull_21108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}