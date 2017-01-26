package org.gradle.test.performancenull_242;

import static org.junit.Assert.*;

public class Testnull_24199 {
    private final Productionnull_24199 production = new Productionnull_24199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}