package org.gradle.test.performancenull_192;

import static org.junit.Assert.*;

public class Testnull_19199 {
    private final Productionnull_19199 production = new Productionnull_19199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}