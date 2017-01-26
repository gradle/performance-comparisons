package org.gradle.test.performancenull_231;

import static org.junit.Assert.*;

public class Testnull_23053 {
    private final Productionnull_23053 production = new Productionnull_23053("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}