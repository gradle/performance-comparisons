package org.gradle.test.performancenull_230;

import static org.junit.Assert.*;

public class Testnull_22931 {
    private final Productionnull_22931 production = new Productionnull_22931("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}