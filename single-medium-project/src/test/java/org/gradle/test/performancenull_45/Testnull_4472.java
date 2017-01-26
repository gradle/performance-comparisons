package org.gradle.test.performancenull_45;

import static org.junit.Assert.*;

public class Testnull_4472 {
    private final Productionnull_4472 production = new Productionnull_4472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}