package org.gradle.test.performancenull_485;

import static org.junit.Assert.*;

public class Testnull_48469 {
    private final Productionnull_48469 production = new Productionnull_48469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}