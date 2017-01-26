package org.gradle.test.performancenull_321;

import static org.junit.Assert.*;

public class Testnull_32072 {
    private final Productionnull_32072 production = new Productionnull_32072("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}