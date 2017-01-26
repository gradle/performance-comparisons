package org.gradle.test.performancenull_440;

import static org.junit.Assert.*;

public class Testnull_43975 {
    private final Productionnull_43975 production = new Productionnull_43975("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}