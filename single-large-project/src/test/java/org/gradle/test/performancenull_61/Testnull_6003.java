package org.gradle.test.performancenull_61;

import static org.junit.Assert.*;

public class Testnull_6003 {
    private final Productionnull_6003 production = new Productionnull_6003("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}