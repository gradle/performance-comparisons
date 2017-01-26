package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3196 {
    private final Productionnull_3196 production = new Productionnull_3196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}