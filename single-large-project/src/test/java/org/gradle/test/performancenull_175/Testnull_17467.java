package org.gradle.test.performancenull_175;

import static org.junit.Assert.*;

public class Testnull_17467 {
    private final Productionnull_17467 production = new Productionnull_17467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}