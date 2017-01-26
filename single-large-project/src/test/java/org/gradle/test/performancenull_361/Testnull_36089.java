package org.gradle.test.performancenull_361;

import static org.junit.Assert.*;

public class Testnull_36089 {
    private final Productionnull_36089 production = new Productionnull_36089("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}