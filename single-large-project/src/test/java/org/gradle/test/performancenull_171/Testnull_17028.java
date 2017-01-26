package org.gradle.test.performancenull_171;

import static org.junit.Assert.*;

public class Testnull_17028 {
    private final Productionnull_17028 production = new Productionnull_17028("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}