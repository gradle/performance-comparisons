package org.gradle.test.performancenull_353;

import static org.junit.Assert.*;

public class Testnull_35270 {
    private final Productionnull_35270 production = new Productionnull_35270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}