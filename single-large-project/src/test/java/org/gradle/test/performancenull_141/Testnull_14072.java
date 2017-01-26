package org.gradle.test.performancenull_141;

import static org.junit.Assert.*;

public class Testnull_14072 {
    private final Productionnull_14072 production = new Productionnull_14072("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}