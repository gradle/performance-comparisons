package org.gradle.test.performancenull_368;

import static org.junit.Assert.*;

public class Testnull_36739 {
    private final Productionnull_36739 production = new Productionnull_36739("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}