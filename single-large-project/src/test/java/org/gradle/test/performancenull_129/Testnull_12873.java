package org.gradle.test.performancenull_129;

import static org.junit.Assert.*;

public class Testnull_12873 {
    private final Productionnull_12873 production = new Productionnull_12873("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}