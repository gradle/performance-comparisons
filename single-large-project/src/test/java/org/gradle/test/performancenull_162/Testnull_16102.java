package org.gradle.test.performancenull_162;

import static org.junit.Assert.*;

public class Testnull_16102 {
    private final Productionnull_16102 production = new Productionnull_16102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}