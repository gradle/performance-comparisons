package org.gradle.test.performancenull_282;

import static org.junit.Assert.*;

public class Testnull_28168 {
    private final Productionnull_28168 production = new Productionnull_28168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}