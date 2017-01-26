package org.gradle.test.performancenull_232;

import static org.junit.Assert.*;

public class Testnull_23102 {
    private final Productionnull_23102 production = new Productionnull_23102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}