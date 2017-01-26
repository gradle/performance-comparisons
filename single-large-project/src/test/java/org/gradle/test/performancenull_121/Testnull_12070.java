package org.gradle.test.performancenull_121;

import static org.junit.Assert.*;

public class Testnull_12070 {
    private final Productionnull_12070 production = new Productionnull_12070("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}