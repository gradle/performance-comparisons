package org.gradle.test.performancenull_325;

import static org.junit.Assert.*;

public class Testnull_32409 {
    private final Productionnull_32409 production = new Productionnull_32409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}