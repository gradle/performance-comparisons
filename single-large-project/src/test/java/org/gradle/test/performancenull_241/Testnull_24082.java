package org.gradle.test.performancenull_241;

import static org.junit.Assert.*;

public class Testnull_24082 {
    private final Productionnull_24082 production = new Productionnull_24082("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}