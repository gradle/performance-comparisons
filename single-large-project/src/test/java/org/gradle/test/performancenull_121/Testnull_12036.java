package org.gradle.test.performancenull_121;

import static org.junit.Assert.*;

public class Testnull_12036 {
    private final Productionnull_12036 production = new Productionnull_12036("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}