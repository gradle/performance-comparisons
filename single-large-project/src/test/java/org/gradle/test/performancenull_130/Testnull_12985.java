package org.gradle.test.performancenull_130;

import static org.junit.Assert.*;

public class Testnull_12985 {
    private final Productionnull_12985 production = new Productionnull_12985("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}