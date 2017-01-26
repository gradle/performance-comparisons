package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3198 {
    private final Productionnull_3198 production = new Productionnull_3198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}