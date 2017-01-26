package org.gradle.test.performancenull_135;

import static org.junit.Assert.*;

public class Testnull_13491 {
    private final Productionnull_13491 production = new Productionnull_13491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}