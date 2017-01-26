package org.gradle.test.performancenull_161;

import static org.junit.Assert.*;

public class Testnull_16042 {
    private final Productionnull_16042 production = new Productionnull_16042("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}