package org.gradle.test.performancenull_185;

import static org.junit.Assert.*;

public class Testnull_18497 {
    private final Productionnull_18497 production = new Productionnull_18497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}