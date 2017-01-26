package org.gradle.test.performancenull_462;

import static org.junit.Assert.*;

public class Testnull_46149 {
    private final Productionnull_46149 production = new Productionnull_46149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}