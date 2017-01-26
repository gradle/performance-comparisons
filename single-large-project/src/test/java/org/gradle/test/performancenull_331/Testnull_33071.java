package org.gradle.test.performancenull_331;

import static org.junit.Assert.*;

public class Testnull_33071 {
    private final Productionnull_33071 production = new Productionnull_33071("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}