package org.gradle.test.performancenull_300;

import static org.junit.Assert.*;

public class Testnull_29928 {
    private final Productionnull_29928 production = new Productionnull_29928("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}