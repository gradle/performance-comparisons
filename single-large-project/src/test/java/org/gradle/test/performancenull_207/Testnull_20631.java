package org.gradle.test.performancenull_207;

import static org.junit.Assert.*;

public class Testnull_20631 {
    private final Productionnull_20631 production = new Productionnull_20631("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}