package org.gradle.test.performancenull_212;

import static org.junit.Assert.*;

public class Testnull_21158 {
    private final Productionnull_21158 production = new Productionnull_21158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}