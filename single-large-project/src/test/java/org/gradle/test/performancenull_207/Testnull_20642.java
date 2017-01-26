package org.gradle.test.performancenull_207;

import static org.junit.Assert.*;

public class Testnull_20642 {
    private final Productionnull_20642 production = new Productionnull_20642("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}