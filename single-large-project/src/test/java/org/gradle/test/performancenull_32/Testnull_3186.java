package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3186 {
    private final Productionnull_3186 production = new Productionnull_3186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}