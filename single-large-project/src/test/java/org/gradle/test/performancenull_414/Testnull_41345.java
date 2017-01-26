package org.gradle.test.performancenull_414;

import static org.junit.Assert.*;

public class Testnull_41345 {
    private final Productionnull_41345 production = new Productionnull_41345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}