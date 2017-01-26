package org.gradle.test.performancenull_217;

import static org.junit.Assert.*;

public class Testnull_21698 {
    private final Productionnull_21698 production = new Productionnull_21698("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}