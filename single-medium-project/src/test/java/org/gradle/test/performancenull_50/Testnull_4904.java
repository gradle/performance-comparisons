package org.gradle.test.performancenull_50;

import static org.junit.Assert.*;

public class Testnull_4904 {
    private final Productionnull_4904 production = new Productionnull_4904("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}