package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17981 {
    private final Productionnull_17981 production = new Productionnull_17981("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}