package org.gradle.test.performancenull_221;

import static org.junit.Assert.*;

public class Testnull_22060 {
    private final Productionnull_22060 production = new Productionnull_22060("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}