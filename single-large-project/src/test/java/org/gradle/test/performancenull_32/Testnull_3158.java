package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3158 {
    private final Productionnull_3158 production = new Productionnull_3158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}