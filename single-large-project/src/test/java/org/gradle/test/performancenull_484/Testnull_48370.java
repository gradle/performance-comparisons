package org.gradle.test.performancenull_484;

import static org.junit.Assert.*;

public class Testnull_48370 {
    private final Productionnull_48370 production = new Productionnull_48370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}