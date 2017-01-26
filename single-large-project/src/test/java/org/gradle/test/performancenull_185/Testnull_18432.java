package org.gradle.test.performancenull_185;

import static org.junit.Assert.*;

public class Testnull_18432 {
    private final Productionnull_18432 production = new Productionnull_18432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}