package org.gradle.test.performancenull_360;

import static org.junit.Assert.*;

public class Testnull_35922 {
    private final Productionnull_35922 production = new Productionnull_35922("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}