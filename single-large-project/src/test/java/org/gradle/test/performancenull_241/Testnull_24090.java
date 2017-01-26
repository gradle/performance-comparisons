package org.gradle.test.performancenull_241;

import static org.junit.Assert.*;

public class Testnull_24090 {
    private final Productionnull_24090 production = new Productionnull_24090("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}