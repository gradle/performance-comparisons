package org.gradle.test.performancenull_103;

import static org.junit.Assert.*;

public class Testnull_10286 {
    private final Productionnull_10286 production = new Productionnull_10286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}