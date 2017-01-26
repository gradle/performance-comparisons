package org.gradle.test.performancenull_53;

import static org.junit.Assert.*;

public class Testnull_5289 {
    private final Productionnull_5289 production = new Productionnull_5289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}