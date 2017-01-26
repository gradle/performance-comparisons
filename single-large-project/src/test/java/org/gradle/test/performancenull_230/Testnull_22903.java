package org.gradle.test.performancenull_230;

import static org.junit.Assert.*;

public class Testnull_22903 {
    private final Productionnull_22903 production = new Productionnull_22903("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}