package org.gradle.test.performancenull_484;

import static org.junit.Assert.*;

public class Testnull_48372 {
    private final Productionnull_48372 production = new Productionnull_48372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}