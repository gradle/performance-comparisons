package org.gradle.test.performancenull_207;

import static org.junit.Assert.*;

public class Testnull_20693 {
    private final Productionnull_20693 production = new Productionnull_20693("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}