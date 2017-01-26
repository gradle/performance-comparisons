package org.gradle.test.performancenull_391;

import static org.junit.Assert.*;

public class Testnull_39080 {
    private final Productionnull_39080 production = new Productionnull_39080("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}