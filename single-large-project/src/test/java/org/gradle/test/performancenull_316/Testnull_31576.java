package org.gradle.test.performancenull_316;

import static org.junit.Assert.*;

public class Testnull_31576 {
    private final Productionnull_31576 production = new Productionnull_31576("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}