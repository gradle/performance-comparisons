package org.gradle.test.performancenull_485;

import static org.junit.Assert.*;

public class Testnull_48431 {
    private final Productionnull_48431 production = new Productionnull_48431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}