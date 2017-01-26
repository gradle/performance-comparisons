package org.gradle.test.performancenull_190;

import static org.junit.Assert.*;

public class Testnull_18996 {
    private final Productionnull_18996 production = new Productionnull_18996("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}