package org.gradle.test.performancenull_256;

import static org.junit.Assert.*;

public class Testnull_25531 {
    private final Productionnull_25531 production = new Productionnull_25531("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}