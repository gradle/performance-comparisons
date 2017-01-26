package org.gradle.test.performancenull_207;

import static org.junit.Assert.*;

public class Testnull_20673 {
    private final Productionnull_20673 production = new Productionnull_20673("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}