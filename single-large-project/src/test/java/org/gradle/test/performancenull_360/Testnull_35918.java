package org.gradle.test.performancenull_360;

import static org.junit.Assert.*;

public class Testnull_35918 {
    private final Productionnull_35918 production = new Productionnull_35918("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}