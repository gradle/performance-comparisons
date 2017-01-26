package org.gradle.test.performancenull_207;

import static org.junit.Assert.*;

public class Testnull_20679 {
    private final Productionnull_20679 production = new Productionnull_20679("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}