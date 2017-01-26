package org.gradle.test.performancenull_2;

import static org.junit.Assert.*;

public class Testnull_171 {
    private final Productionnull_171 production = new Productionnull_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}