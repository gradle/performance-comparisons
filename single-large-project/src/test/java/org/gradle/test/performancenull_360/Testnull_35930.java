package org.gradle.test.performancenull_360;

import static org.junit.Assert.*;

public class Testnull_35930 {
    private final Productionnull_35930 production = new Productionnull_35930("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}