package org.gradle.test.performancenull_135;

import static org.junit.Assert.*;

public class Testnull_13478 {
    private final Productionnull_13478 production = new Productionnull_13478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}