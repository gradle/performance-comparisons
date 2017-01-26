package org.gradle.test.performancenull_209;

import static org.junit.Assert.*;

public class Testnull_20863 {
    private final Productionnull_20863 production = new Productionnull_20863("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}