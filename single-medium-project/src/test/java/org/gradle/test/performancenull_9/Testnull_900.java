package org.gradle.test.performancenull_9;

import static org.junit.Assert.*;

public class Testnull_900 {
    private final Productionnull_900 production = new Productionnull_900("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}