package org.gradle.test.performancenull_121;

import static org.junit.Assert.*;

public class Testnull_12026 {
    private final Productionnull_12026 production = new Productionnull_12026("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}