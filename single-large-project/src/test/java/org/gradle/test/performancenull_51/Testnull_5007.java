package org.gradle.test.performancenull_51;

import static org.junit.Assert.*;

public class Testnull_5007 {
    private final Productionnull_5007 production = new Productionnull_5007("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}