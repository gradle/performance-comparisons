package org.gradle.test.performancenull_383;

import static org.junit.Assert.*;

public class Testnull_38265 {
    private final Productionnull_38265 production = new Productionnull_38265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}