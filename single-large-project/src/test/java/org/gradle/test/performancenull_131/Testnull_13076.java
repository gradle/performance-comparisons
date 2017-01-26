package org.gradle.test.performancenull_131;

import static org.junit.Assert.*;

public class Testnull_13076 {
    private final Productionnull_13076 production = new Productionnull_13076("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}