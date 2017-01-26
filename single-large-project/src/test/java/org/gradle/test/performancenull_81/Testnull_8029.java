package org.gradle.test.performancenull_81;

import static org.junit.Assert.*;

public class Testnull_8029 {
    private final Productionnull_8029 production = new Productionnull_8029("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}