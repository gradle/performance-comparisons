package org.gradle.test.performancenull_370;

import static org.junit.Assert.*;

public class Testnull_36954 {
    private final Productionnull_36954 production = new Productionnull_36954("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}