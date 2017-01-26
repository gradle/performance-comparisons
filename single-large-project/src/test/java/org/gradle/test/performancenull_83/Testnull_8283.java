package org.gradle.test.performancenull_83;

import static org.junit.Assert.*;

public class Testnull_8283 {
    private final Productionnull_8283 production = new Productionnull_8283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}