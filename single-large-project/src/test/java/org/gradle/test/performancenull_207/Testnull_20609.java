package org.gradle.test.performancenull_207;

import static org.junit.Assert.*;

public class Testnull_20609 {
    private final Productionnull_20609 production = new Productionnull_20609("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}