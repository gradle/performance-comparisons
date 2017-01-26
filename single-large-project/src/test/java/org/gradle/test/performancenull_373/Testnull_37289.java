package org.gradle.test.performancenull_373;

import static org.junit.Assert.*;

public class Testnull_37289 {
    private final Productionnull_37289 production = new Productionnull_37289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}