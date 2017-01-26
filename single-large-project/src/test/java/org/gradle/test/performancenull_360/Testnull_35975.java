package org.gradle.test.performancenull_360;

import static org.junit.Assert.*;

public class Testnull_35975 {
    private final Productionnull_35975 production = new Productionnull_35975("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}