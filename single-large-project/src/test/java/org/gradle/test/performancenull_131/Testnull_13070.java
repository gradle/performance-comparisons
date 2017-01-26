package org.gradle.test.performancenull_131;

import static org.junit.Assert.*;

public class Testnull_13070 {
    private final Productionnull_13070 production = new Productionnull_13070("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}