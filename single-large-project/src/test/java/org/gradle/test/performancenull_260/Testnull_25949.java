package org.gradle.test.performancenull_260;

import static org.junit.Assert.*;

public class Testnull_25949 {
    private final Productionnull_25949 production = new Productionnull_25949("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}