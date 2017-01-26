package org.gradle.test.performancenull_135;

import static org.junit.Assert.*;

public class Testnull_13500 {
    private final Productionnull_13500 production = new Productionnull_13500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}