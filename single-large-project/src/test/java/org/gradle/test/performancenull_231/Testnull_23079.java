package org.gradle.test.performancenull_231;

import static org.junit.Assert.*;

public class Testnull_23079 {
    private final Productionnull_23079 production = new Productionnull_23079("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}