package org.gradle.test.performancenull_83;

import static org.junit.Assert.*;

public class Testnull_8209 {
    private final Productionnull_8209 production = new Productionnull_8209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}