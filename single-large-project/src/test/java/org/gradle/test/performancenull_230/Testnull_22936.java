package org.gradle.test.performancenull_230;

import static org.junit.Assert.*;

public class Testnull_22936 {
    private final Productionnull_22936 production = new Productionnull_22936("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}