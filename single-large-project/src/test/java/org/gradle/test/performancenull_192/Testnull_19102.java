package org.gradle.test.performancenull_192;

import static org.junit.Assert.*;

public class Testnull_19102 {
    private final Productionnull_19102 production = new Productionnull_19102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}