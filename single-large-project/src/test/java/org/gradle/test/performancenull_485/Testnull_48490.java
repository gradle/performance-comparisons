package org.gradle.test.performancenull_485;

import static org.junit.Assert.*;

public class Testnull_48490 {
    private final Productionnull_48490 production = new Productionnull_48490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}