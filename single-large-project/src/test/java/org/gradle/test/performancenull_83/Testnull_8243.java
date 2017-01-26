package org.gradle.test.performancenull_83;

import static org.junit.Assert.*;

public class Testnull_8243 {
    private final Productionnull_8243 production = new Productionnull_8243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}