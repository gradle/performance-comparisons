package org.gradle.test.performancenull_183;

import static org.junit.Assert.*;

public class Testnull_18270 {
    private final Productionnull_18270 production = new Productionnull_18270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}