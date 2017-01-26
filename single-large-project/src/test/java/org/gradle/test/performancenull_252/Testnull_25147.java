package org.gradle.test.performancenull_252;

import static org.junit.Assert.*;

public class Testnull_25147 {
    private final Productionnull_25147 production = new Productionnull_25147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}