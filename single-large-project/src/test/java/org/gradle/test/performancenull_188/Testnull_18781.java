package org.gradle.test.performancenull_188;

import static org.junit.Assert.*;

public class Testnull_18781 {
    private final Productionnull_18781 production = new Productionnull_18781("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}