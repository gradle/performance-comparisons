package org.gradle.test.performancenull_46;

import static org.junit.Assert.*;

public class Testnull_4518 {
    private final Productionnull_4518 production = new Productionnull_4518("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}