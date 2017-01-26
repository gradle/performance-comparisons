package org.gradle.test.performancenull_214;

import static org.junit.Assert.*;

public class Testnull_21342 {
    private final Productionnull_21342 production = new Productionnull_21342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}