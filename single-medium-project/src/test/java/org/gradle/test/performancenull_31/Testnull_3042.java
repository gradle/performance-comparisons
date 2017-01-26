package org.gradle.test.performancenull_31;

import static org.junit.Assert.*;

public class Testnull_3042 {
    private final Productionnull_3042 production = new Productionnull_3042("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}