package org.gradle.test.performancenull_231;

import static org.junit.Assert.*;

public class Testnull_23042 {
    private final Productionnull_23042 production = new Productionnull_23042("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}