package org.gradle.test.performancenull_192;

import static org.junit.Assert.*;

public class Testnull_19187 {
    private final Productionnull_19187 production = new Productionnull_19187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}