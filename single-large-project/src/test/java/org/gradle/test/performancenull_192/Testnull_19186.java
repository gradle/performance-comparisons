package org.gradle.test.performancenull_192;

import static org.junit.Assert.*;

public class Testnull_19186 {
    private final Productionnull_19186 production = new Productionnull_19186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}