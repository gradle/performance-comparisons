package org.gradle.test.performancenull_210;

import static org.junit.Assert.*;

public class Testnull_20975 {
    private final Productionnull_20975 production = new Productionnull_20975("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}