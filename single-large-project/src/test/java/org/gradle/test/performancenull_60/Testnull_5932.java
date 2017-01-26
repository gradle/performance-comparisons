package org.gradle.test.performancenull_60;

import static org.junit.Assert.*;

public class Testnull_5932 {
    private final Productionnull_5932 production = new Productionnull_5932("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}