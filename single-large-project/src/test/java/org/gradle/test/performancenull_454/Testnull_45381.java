package org.gradle.test.performancenull_454;

import static org.junit.Assert.*;

public class Testnull_45381 {
    private final Productionnull_45381 production = new Productionnull_45381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}