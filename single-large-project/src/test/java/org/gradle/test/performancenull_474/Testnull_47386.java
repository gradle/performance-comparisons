package org.gradle.test.performancenull_474;

import static org.junit.Assert.*;

public class Testnull_47386 {
    private final Productionnull_47386 production = new Productionnull_47386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}