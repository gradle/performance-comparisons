package org.gradle.test.performancenull_403;

import static org.junit.Assert.*;

public class Testnull_40291 {
    private final Productionnull_40291 production = new Productionnull_40291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}