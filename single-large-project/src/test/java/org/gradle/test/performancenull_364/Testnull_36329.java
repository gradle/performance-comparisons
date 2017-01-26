package org.gradle.test.performancenull_364;

import static org.junit.Assert.*;

public class Testnull_36329 {
    private final Productionnull_36329 production = new Productionnull_36329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}