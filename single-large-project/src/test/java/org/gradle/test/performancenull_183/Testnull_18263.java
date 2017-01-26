package org.gradle.test.performancenull_183;

import static org.junit.Assert.*;

public class Testnull_18263 {
    private final Productionnull_18263 production = new Productionnull_18263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}