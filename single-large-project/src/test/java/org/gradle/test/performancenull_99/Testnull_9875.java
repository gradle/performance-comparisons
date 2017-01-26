package org.gradle.test.performancenull_99;

import static org.junit.Assert.*;

public class Testnull_9875 {
    private final Productionnull_9875 production = new Productionnull_9875("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}