package org.gradle.test.performancenull_25;

import static org.junit.Assert.*;

public class Testnull_2467 {
    private final Productionnull_2467 production = new Productionnull_2467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}