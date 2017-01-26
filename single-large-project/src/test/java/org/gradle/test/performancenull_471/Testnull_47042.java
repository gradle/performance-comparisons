package org.gradle.test.performancenull_471;

import static org.junit.Assert.*;

public class Testnull_47042 {
    private final Productionnull_47042 production = new Productionnull_47042("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}