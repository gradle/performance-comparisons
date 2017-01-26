package org.gradle.test.performancenull_212;

import static org.junit.Assert.*;

public class Testnull_21186 {
    private final Productionnull_21186 production = new Productionnull_21186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}