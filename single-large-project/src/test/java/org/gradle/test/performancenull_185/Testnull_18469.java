package org.gradle.test.performancenull_185;

import static org.junit.Assert.*;

public class Testnull_18469 {
    private final Productionnull_18469 production = new Productionnull_18469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}