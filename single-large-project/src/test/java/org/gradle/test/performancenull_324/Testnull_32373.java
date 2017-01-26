package org.gradle.test.performancenull_324;

import static org.junit.Assert.*;

public class Testnull_32373 {
    private final Productionnull_32373 production = new Productionnull_32373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}