package org.gradle.test.performancenull_215;

import static org.junit.Assert.*;

public class Testnull_21483 {
    private final Productionnull_21483 production = new Productionnull_21483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}