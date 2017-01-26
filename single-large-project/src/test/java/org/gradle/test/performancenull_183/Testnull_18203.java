package org.gradle.test.performancenull_183;

import static org.junit.Assert.*;

public class Testnull_18203 {
    private final Productionnull_18203 production = new Productionnull_18203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}