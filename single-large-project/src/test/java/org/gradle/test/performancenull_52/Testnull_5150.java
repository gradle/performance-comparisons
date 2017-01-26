package org.gradle.test.performancenull_52;

import static org.junit.Assert.*;

public class Testnull_5150 {
    private final Productionnull_5150 production = new Productionnull_5150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}