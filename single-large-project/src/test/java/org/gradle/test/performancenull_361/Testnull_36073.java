package org.gradle.test.performancenull_361;

import static org.junit.Assert.*;

public class Testnull_36073 {
    private final Productionnull_36073 production = new Productionnull_36073("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}