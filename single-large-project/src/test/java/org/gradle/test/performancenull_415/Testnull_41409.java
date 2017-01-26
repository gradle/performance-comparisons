package org.gradle.test.performancenull_415;

import static org.junit.Assert.*;

public class Testnull_41409 {
    private final Productionnull_41409 production = new Productionnull_41409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}