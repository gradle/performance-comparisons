package org.gradle.test.performancenull_360;

import static org.junit.Assert.*;

public class Testnull_35929 {
    private final Productionnull_35929 production = new Productionnull_35929("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}