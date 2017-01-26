package org.gradle.test.performancenull_175;

import static org.junit.Assert.*;

public class Testnull_17469 {
    private final Productionnull_17469 production = new Productionnull_17469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}