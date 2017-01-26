package org.gradle.test.performancenull_256;

import static org.junit.Assert.*;

public class Testnull_25576 {
    private final Productionnull_25576 production = new Productionnull_25576("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}