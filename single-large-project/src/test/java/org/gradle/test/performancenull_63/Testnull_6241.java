package org.gradle.test.performancenull_63;

import static org.junit.Assert.*;

public class Testnull_6241 {
    private final Productionnull_6241 production = new Productionnull_6241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}