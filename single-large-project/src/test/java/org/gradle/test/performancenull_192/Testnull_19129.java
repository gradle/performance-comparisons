package org.gradle.test.performancenull_192;

import static org.junit.Assert.*;

public class Testnull_19129 {
    private final Productionnull_19129 production = new Productionnull_19129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}