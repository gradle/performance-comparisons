package org.gradle.test.performancenull_430;

import static org.junit.Assert.*;

public class Testnull_42943 {
    private final Productionnull_42943 production = new Productionnull_42943("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}