package org.gradle.test.performancenull_183;

import static org.junit.Assert.*;

public class Testnull_18281 {
    private final Productionnull_18281 production = new Productionnull_18281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}