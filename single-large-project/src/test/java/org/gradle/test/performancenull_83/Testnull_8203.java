package org.gradle.test.performancenull_83;

import static org.junit.Assert.*;

public class Testnull_8203 {
    private final Productionnull_8203 production = new Productionnull_8203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}