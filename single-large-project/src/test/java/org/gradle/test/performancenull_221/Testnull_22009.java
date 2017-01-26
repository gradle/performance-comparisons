package org.gradle.test.performancenull_221;

import static org.junit.Assert.*;

public class Testnull_22009 {
    private final Productionnull_22009 production = new Productionnull_22009("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}