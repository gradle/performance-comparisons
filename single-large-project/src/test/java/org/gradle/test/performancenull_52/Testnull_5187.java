package org.gradle.test.performancenull_52;

import static org.junit.Assert.*;

public class Testnull_5187 {
    private final Productionnull_5187 production = new Productionnull_5187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}