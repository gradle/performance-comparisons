package org.gradle.test.performancenull_90;

import static org.junit.Assert.*;

public class Testnull_8932 {
    private final Productionnull_8932 production = new Productionnull_8932("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}