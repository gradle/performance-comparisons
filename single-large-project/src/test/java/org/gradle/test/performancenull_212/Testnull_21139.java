package org.gradle.test.performancenull_212;

import static org.junit.Assert.*;

public class Testnull_21139 {
    private final Productionnull_21139 production = new Productionnull_21139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}