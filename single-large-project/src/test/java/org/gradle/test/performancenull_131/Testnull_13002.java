package org.gradle.test.performancenull_131;

import static org.junit.Assert.*;

public class Testnull_13002 {
    private final Productionnull_13002 production = new Productionnull_13002("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}