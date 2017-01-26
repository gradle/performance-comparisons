package org.gradle.test.performancenull_103;

import static org.junit.Assert.*;

public class Testnull_10246 {
    private final Productionnull_10246 production = new Productionnull_10246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}