package org.gradle.test.performancenull_384;

import static org.junit.Assert.*;

public class Testnull_38354 {
    private final Productionnull_38354 production = new Productionnull_38354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}