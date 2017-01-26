package org.gradle.test.performancenull_216;

import static org.junit.Assert.*;

public class Testnull_21549 {
    private final Productionnull_21549 production = new Productionnull_21549("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}