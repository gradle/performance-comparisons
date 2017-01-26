package org.gradle.test.performancenull_320;

import static org.junit.Assert.*;

public class Testnull_31981 {
    private final Productionnull_31981 production = new Productionnull_31981("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}