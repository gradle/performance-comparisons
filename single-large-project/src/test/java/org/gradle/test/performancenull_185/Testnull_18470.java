package org.gradle.test.performancenull_185;

import static org.junit.Assert.*;

public class Testnull_18470 {
    private final Productionnull_18470 production = new Productionnull_18470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}