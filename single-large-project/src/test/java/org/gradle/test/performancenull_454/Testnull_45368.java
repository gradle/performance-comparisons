package org.gradle.test.performancenull_454;

import static org.junit.Assert.*;

public class Testnull_45368 {
    private final Productionnull_45368 production = new Productionnull_45368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}