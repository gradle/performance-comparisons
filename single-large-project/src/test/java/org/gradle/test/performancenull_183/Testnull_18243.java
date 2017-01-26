package org.gradle.test.performancenull_183;

import static org.junit.Assert.*;

public class Testnull_18243 {
    private final Productionnull_18243 production = new Productionnull_18243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}