package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3147 {
    private final Productionnull_3147 production = new Productionnull_3147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}