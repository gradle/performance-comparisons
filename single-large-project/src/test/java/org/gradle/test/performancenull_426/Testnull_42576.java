package org.gradle.test.performancenull_426;

import static org.junit.Assert.*;

public class Testnull_42576 {
    private final Productionnull_42576 production = new Productionnull_42576("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}