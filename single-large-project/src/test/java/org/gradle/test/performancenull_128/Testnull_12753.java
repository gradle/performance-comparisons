package org.gradle.test.performancenull_128;

import static org.junit.Assert.*;

public class Testnull_12753 {
    private final Productionnull_12753 production = new Productionnull_12753("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}