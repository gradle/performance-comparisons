package org.gradle.test.performancenull_221;

import static org.junit.Assert.*;

public class Testnull_22072 {
    private final Productionnull_22072 production = new Productionnull_22072("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}