package org.gradle.test.performancenull_484;

import static org.junit.Assert.*;

public class Testnull_48386 {
    private final Productionnull_48386 production = new Productionnull_48386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}