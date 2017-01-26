package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42069 {
    private final Productionnull_42069 production = new Productionnull_42069("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}