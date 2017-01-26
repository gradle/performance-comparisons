package org.gradle.test.performancenull_454;

import static org.junit.Assert.*;

public class Testnull_45391 {
    private final Productionnull_45391 production = new Productionnull_45391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}