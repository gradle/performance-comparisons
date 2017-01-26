package org.gradle.test.performancenull_120;

import static org.junit.Assert.*;

public class Testnull_11931 {
    private final Productionnull_11931 production = new Productionnull_11931("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}