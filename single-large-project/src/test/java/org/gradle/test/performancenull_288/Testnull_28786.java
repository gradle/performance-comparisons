package org.gradle.test.performancenull_288;

import static org.junit.Assert.*;

public class Testnull_28786 {
    private final Productionnull_28786 production = new Productionnull_28786("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}