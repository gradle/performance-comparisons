package org.gradle.test.performancenull_331;

import static org.junit.Assert.*;

public class Testnull_33091 {
    private final Productionnull_33091 production = new Productionnull_33091("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}