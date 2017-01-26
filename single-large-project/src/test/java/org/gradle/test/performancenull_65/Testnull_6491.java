package org.gradle.test.performancenull_65;

import static org.junit.Assert.*;

public class Testnull_6491 {
    private final Productionnull_6491 production = new Productionnull_6491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}