package org.gradle.test.performancenull_419;

import static org.junit.Assert.*;

public class Testnull_41862 {
    private final Productionnull_41862 production = new Productionnull_41862("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}