package org.gradle.test.performancenull_185;

import static org.junit.Assert.*;

public class Testnull_18475 {
    private final Productionnull_18475 production = new Productionnull_18475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}