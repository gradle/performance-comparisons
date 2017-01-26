package org.gradle.test.performancenull_190;

import static org.junit.Assert.*;

public class Testnull_18968 {
    private final Productionnull_18968 production = new Productionnull_18968("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}