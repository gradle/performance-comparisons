package org.gradle.test.performancenull_12;

import static org.junit.Assert.*;

public class Testnull_1102 {
    private final Productionnull_1102 production = new Productionnull_1102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}