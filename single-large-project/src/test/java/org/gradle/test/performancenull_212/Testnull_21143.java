package org.gradle.test.performancenull_212;

import static org.junit.Assert.*;

public class Testnull_21143 {
    private final Productionnull_21143 production = new Productionnull_21143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}