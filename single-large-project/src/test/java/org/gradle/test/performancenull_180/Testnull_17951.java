package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17951 {
    private final Productionnull_17951 production = new Productionnull_17951("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}