package org.gradle.test.performancenull_325;

import static org.junit.Assert.*;

public class Testnull_32491 {
    private final Productionnull_32491 production = new Productionnull_32491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}