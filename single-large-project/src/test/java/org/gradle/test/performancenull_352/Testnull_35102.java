package org.gradle.test.performancenull_352;

import static org.junit.Assert.*;

public class Testnull_35102 {
    private final Productionnull_35102 production = new Productionnull_35102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}