package org.gradle.test.performancenull_33;

import static org.junit.Assert.*;

public class Testnull_3295 {
    private final Productionnull_3295 production = new Productionnull_3295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}