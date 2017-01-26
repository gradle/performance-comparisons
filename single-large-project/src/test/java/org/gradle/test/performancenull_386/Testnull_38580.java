package org.gradle.test.performancenull_386;

import static org.junit.Assert.*;

public class Testnull_38580 {
    private final Productionnull_38580 production = new Productionnull_38580("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}