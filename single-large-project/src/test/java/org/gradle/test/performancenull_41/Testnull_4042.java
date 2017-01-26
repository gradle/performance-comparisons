package org.gradle.test.performancenull_41;

import static org.junit.Assert.*;

public class Testnull_4042 {
    private final Productionnull_4042 production = new Productionnull_4042("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}