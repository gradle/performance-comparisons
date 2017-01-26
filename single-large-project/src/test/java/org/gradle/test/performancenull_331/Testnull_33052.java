package org.gradle.test.performancenull_331;

import static org.junit.Assert.*;

public class Testnull_33052 {
    private final Productionnull_33052 production = new Productionnull_33052("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}