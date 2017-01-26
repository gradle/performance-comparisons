package org.gradle.test.performancenull_55;

import static org.junit.Assert.*;

public class Testnull_5490 {
    private final Productionnull_5490 production = new Productionnull_5490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}