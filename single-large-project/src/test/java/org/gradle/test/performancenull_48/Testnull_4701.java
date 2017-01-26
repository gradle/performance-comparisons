package org.gradle.test.performancenull_48;

import static org.junit.Assert.*;

public class Testnull_4701 {
    private final Productionnull_4701 production = new Productionnull_4701("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}