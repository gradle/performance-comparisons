package org.gradle.test.performancenull_312;

import static org.junit.Assert.*;

public class Testnull_31183 {
    private final Productionnull_31183 production = new Productionnull_31183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}