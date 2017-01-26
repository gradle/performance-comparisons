package org.gradle.test.performancenull_60;

import static org.junit.Assert.*;

public class Testnull_5941 {
    private final Productionnull_5941 production = new Productionnull_5941("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}