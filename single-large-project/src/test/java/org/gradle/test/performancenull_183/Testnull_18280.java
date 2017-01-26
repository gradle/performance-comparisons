package org.gradle.test.performancenull_183;

import static org.junit.Assert.*;

public class Testnull_18280 {
    private final Productionnull_18280 production = new Productionnull_18280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}