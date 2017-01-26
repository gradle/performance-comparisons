package org.gradle.test.performancenull_353;

import static org.junit.Assert.*;

public class Testnull_35293 {
    private final Productionnull_35293 production = new Productionnull_35293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}