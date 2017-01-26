package org.gradle.test.performancenull_81;

import static org.junit.Assert.*;

public class Testnull_8074 {
    private final Productionnull_8074 production = new Productionnull_8074("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}