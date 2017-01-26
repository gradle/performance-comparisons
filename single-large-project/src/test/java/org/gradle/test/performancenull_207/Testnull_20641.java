package org.gradle.test.performancenull_207;

import static org.junit.Assert.*;

public class Testnull_20641 {
    private final Productionnull_20641 production = new Productionnull_20641("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}