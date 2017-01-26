package org.gradle.test.performancenull_485;

import static org.junit.Assert.*;

public class Testnull_48467 {
    private final Productionnull_48467 production = new Productionnull_48467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}