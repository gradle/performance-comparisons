package org.gradle.test.performancenull_251;

import static org.junit.Assert.*;

public class Testnull_25071 {
    private final Productionnull_25071 production = new Productionnull_25071("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}