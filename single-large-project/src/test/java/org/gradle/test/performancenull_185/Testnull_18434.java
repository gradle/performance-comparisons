package org.gradle.test.performancenull_185;

import static org.junit.Assert.*;

public class Testnull_18434 {
    private final Productionnull_18434 production = new Productionnull_18434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}