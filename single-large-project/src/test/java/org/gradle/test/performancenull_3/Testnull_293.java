package org.gradle.test.performancenull_3;

import static org.junit.Assert.*;

public class Testnull_293 {
    private final Productionnull_293 production = new Productionnull_293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}