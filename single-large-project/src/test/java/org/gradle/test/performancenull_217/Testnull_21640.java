package org.gradle.test.performancenull_217;

import static org.junit.Assert.*;

public class Testnull_21640 {
    private final Productionnull_21640 production = new Productionnull_21640("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}