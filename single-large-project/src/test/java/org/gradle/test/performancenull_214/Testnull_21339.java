package org.gradle.test.performancenull_214;

import static org.junit.Assert.*;

public class Testnull_21339 {
    private final Productionnull_21339 production = new Productionnull_21339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}