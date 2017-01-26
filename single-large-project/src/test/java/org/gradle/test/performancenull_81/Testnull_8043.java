package org.gradle.test.performancenull_81;

import static org.junit.Assert.*;

public class Testnull_8043 {
    private final Productionnull_8043 production = new Productionnull_8043("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}