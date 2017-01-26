package org.gradle.test.performancenull_33;

import static org.junit.Assert.*;

public class Testnull_3244 {
    private final Productionnull_3244 production = new Productionnull_3244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}