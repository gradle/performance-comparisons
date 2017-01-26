package org.gradle.test.performancenull_241;

import static org.junit.Assert.*;

public class Testnull_24093 {
    private final Productionnull_24093 production = new Productionnull_24093("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}