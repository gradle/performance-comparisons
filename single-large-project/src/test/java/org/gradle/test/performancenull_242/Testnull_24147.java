package org.gradle.test.performancenull_242;

import static org.junit.Assert.*;

public class Testnull_24147 {
    private final Productionnull_24147 production = new Productionnull_24147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}