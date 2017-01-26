package org.gradle.test.performancenull_270;

import static org.junit.Assert.*;

public class Testnull_26931 {
    private final Productionnull_26931 production = new Productionnull_26931("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}